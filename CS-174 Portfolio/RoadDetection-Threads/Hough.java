/**
 * Programmer: Chris Tralie (modified by CS 174 student)
 * Purpose: To use the hough transform to find lines in an edge image.  Students
 * will convert this into thread-safe parallel code by making this implement the
 * runnable interface and having it compute different ranges of angles in parallel
*/
import java.awt.Color;
import java.util.Arrays;

/**
 *
 * @author btdou
 */
public class Hough implements Runnable {
    private EdgeImage image;
    private static int NAngles;
    private int NRad;
    private float thresh;
    private int start;
    private int stop;

    /**
     * Initialize a hough transform for lines
     * @param image The edge image to do this on
     * @param NAngles Number of angles to sweep from 0 to 2PI at each offset
     * @param NRad number of offsets
     * @param thresh Threshold over which to consider an edge to have enough 
     *               energy to draw
     */
    public Hough(EdgeImage image, int NAngles, int NRad, float thresh, int start, int stop) {
        this.image = image;
        this.NAngles = NAngles;
        this.NRad = NRad;
        this.thresh = thresh;
        this.start = start;
        this.stop = stop;
    }

    /**
     * Draw a line at a particular angle at a particular distance
     * from the center
     * @param angle Angle between 0 and 2PI
     * @param r Distance from center
     */
    public void drawLine(double angle, double r) {
        int M = image.grad.length;
        int N = image.grad[0].length;
        double c = Math.cos(angle);
        double s = Math.sin(angle);
        double di = -s;
        double dj = c;
        for (int k = 0; k < 2; k++) {
            double i = r*c + image.grad.length/2;
            double j = r*s + image.grad[0].length/2;
            while (i >= 0 && j >= 0 && i < M && j < N) {
                int ii = (int)i;
                int jj = (int)j;
                synchronized(image){
                image.picture.set(jj, ii, Color.RED);
            }
                i += di;
                j += dj;
            }
            di *= -1;
            dj *= -1;
        }
    }

    /**
     * Draw the edges using the parameters specified in the constructor
     */
    public void run() {
        int M = image.grad.length;
        int N = image.grad[0].length;
        for (int a = start; a < stop; a++) {
            double angle = 2*Math.PI*a/NAngles;
            double c = Math.cos(angle);
            double s = Math.sin(angle);
            for (int r = 0; r < NRad; r++) {
                double di = -s;
                double dj = c;
                float total = 0.0f;
                for (int k = 0; k < 2; k++) {
                    double i = r*c + image.grad.length/2;
                    double j = r*s + image.grad[0].length/2;
                    while (i >= 0 && j >= 0 && i < M && j < N) {
                        int ii = (int)i;
                        int jj = (int)j;
                        total += image.grad[ii][jj];
                        i += di;
                        j += dj;
                    }
                    di *= -1;
                    dj *= -1;
                }
                if (total > thresh) {
                    drawLine(angle, r);
                }
            }
        }
        synchronized(image){
            image.picture.save("edges.png");
            System.out.println(start +"," + stop + "is done");
        }
    }

    public static void main(String[] args) {
        
        String imagepath = "D:\\Comp-SciSoftware\\home\\btdou\\Lab6_RoadDetection-main\\Lab6_RoadDetection-main\\road.png";
        String threshhold = "5";
        float thresh = Float.parseFloat(threshhold);
        EdgeImage im = new EdgeImage(imagepath);
        int sigma = 3;
        // Step 1: Compute gradient
        im.computeGradient(sigma, 3);
        // Step 2: Nonmax suppression
        im.nonmaxSuppression();
        // Step 3: Get edges
        int NAngles = 4000;
        int start = 0;
        int stop = NAngles/4;
        for(int x = 1; x<5; x++){ 
            Hough h = new Hough(im, NAngles, 1000, thresh, start, stop);
            Thread thread = new Thread(h);
            new Thread(thread).start();            
            start = stop;
            stop = stop + NAngles/4;
            
        }
    }

    

}

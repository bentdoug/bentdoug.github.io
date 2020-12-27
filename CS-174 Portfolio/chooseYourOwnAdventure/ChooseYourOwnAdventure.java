package choose.your.own.adventure;


import java.util.Scanner;

/**
 *
 * @author btdou
 */
public class ChooseYourOwnAdventure {
private static String input = "null"; // the users input
private static boolean keepGoing =true;  //whether or not the loop should stop for any reason
//private static String[] output = new String[4]; //what is to be printed for the user to recieve
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Book.buildBook();
        System.out.println("Type 'Open Book' to begin.  Please make sure to type EXACTLY \n"
                + "what the book says (including capitalization)");
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        input= sc.nextLine();
        while(keepGoing){
            if(Book.callChapter(input)!=null){
                Chapter x = Book.callChapter(input);
                System.out.println("\n\n"+x.getPlot() + x.getOptions());
                keepGoing = x.getStatus();
                input= sc.nextLine();
            }
            else{
                System.out.println("Sorry, that's not a valid input.  Please try again.");
                input= sc.nextLine();
            }
        }
        
    }
    
}
    


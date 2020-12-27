/**
 * A class that holds methods to draw different 3D objects and piece
 * together scenes
 */

/**
 * @author btdou
 * @date 9/13/2020
 * @class CS-174
 * @Assignment 1: Build Your Virtual City
 */
public class MyScene {
        
    /**
     * Draw a city block repeated several times
     */
    
   /**
    * Method that takes the x and z coordinates of the center of the block
    * they are in and creates two trees in specific spots in relation to those coordinates
    * @param scene - the Scene3D object these trees will be written too
    * @param x - the x coordinate of the center point of the city block being built
    * @param z  - the z coordinate of the center point of the city block being built
    */
    
    public static void makeTree(Scene3D scene, int x, int z){
        //start make tree
        scene.addCylinder(4+x, 4, 1+z, 0.5, 8, 102, 51, 0);
        scene.addEllipsoid(4+x, 8, 1+z, 1.5, 2, 1.5, 0, 255, 0);
        //end make tree

        //start make second tree
        scene.addCylinder(12+x, 3.5, 3+z, 0.5, 7, 102, 51, 0);
        scene.addEllipsoid(12+x, 7, 3+z, 1.5, 2, 1.5, 0, 255, 0);
        //end make second tree
    }
    
    
  /**
   * method is exclusively used by the drawArtContest method in order to create 
   * the trees lining the edge of the park in my city
   * @param scene - the Scene3D object these trees will be written too
   * @param x - the x coordinate the tree will be located at
   * @param z - the z coordinate the tree will be located at
   */
    
    public static void makeParkTree(Scene3D scene, int x, int z){
        
        scene.addCylinder(x, 4, z, 0.5, 8, 102, 51, 0);
        scene.addEllipsoid(x, 8, z, 1.5, 2, 1.5, 0, 255, 0);
    }
    
    /**
     * Method that takes the x and z coordinates of the center of the block
     * they are in and creates a fire hydrant in a specific spot in relation to those coordinates
     * @param scene - the Scene3D object this fire hydrant will be written too
     * @param x - the x coordinates of the center point of the city block being built
     * @param z - the z coordinates of the center of the city block being built
     */    
    
    public static void makefirehydrant(Scene3D scene, int x, int z) {
        //make fire-hydrant
        scene.addCylinder(4+x, 0.1, 7+z, 0.35, 0.2, 255, 0, 0);
        scene.addCylinder(4+x, 0.5, 7+z, 0.25, 1, 255, 0, 0);
        scene.addSphere(4+x, 1, 7+z, 0.25, 255, 0, 0);
        scene.addBox(4+x, 0.75, 7+z, 0.75, 0.25, 0.25, 255, 0, 0);
        scene.addBox(4+x, 0.75, 7+z, 0.25, 0.25, 0.75, 255, 0, 0);
        //end make fire-hydrant
    }
    
    /**
     * Method that takes the x and z coordinates of the center of the block
     * they are in and creates a stop light in a specific spot in relation to those coordinates
     * @param scene - the Scene3D object this fire hydrant will be written too
     * @param x - the x coordinates of the center point of the city block being built
     * @param z - the z coordinates of the center point of the city block being built
     */
    
    public static void makeStopLight(Scene3D scene, int x, int z) {
        //make stop light
        scene.addCylinder(4+x, 4, 9+z, 0.25, 8, 0, 0, 0);
        scene.addBox(8+x, 8, 9+z, 8, 0.25, 0.25, 0, 0, 0, 0, 0, 0);
        scene.addBox(9+x, 7, 9+z, 1, 2, 0.25, 0, 0, 0, 0, 0, 0);
        scene.addSphere(9+x, 7.66, 9+z, 0.3, 255, 0, 0);
        scene.addSphere(9+x, 7, 9+z, 0.3, 255, 255, 0);
        scene.addSphere(9+x, 6.33, 9+z, 0.3, 0, 255, 0);
        //end make stop light
    }
    
    /**
     * Method that takes the x and z coordinates of the center of the block
     * they are in and creates two sedans in specific spots with specific orientation in relation to 
     * those coordinates
     * @param scene - the Scene3D object these sedans will be written too
     * @param x - the x coordinates of the center point of the city block being built
     * @param z - the z coordinates of the center point of the city block being built
     */
    public static void makeSedan(Scene3D scene, int x, int z) {
        //make sedan (e->w)
        scene.addBox(8+x, 0.6, 5+z, 1.7, 0.7, 4.5, 255, 255, 0);
        scene.addBox(8+x, 1.35, 4.75+z, 1.4, 0.8, 3.5, 255, 255, 0);
        scene.addCylinder(8+x, 0.4, 6.25+z, 0.5, 2, 100, 100, 100, 180, 0, 90, 1, 1, 1);
        scene.addCylinder(8+x, 0.4, 3.75+z, 0.5, 2, 100, 100, 100, 180, 0, 90, 1, 1, 1);
        //end make sedan (e->w)
        
        //make sedan (n->s)
        scene.addBox(13+x, 0.6, 13+z, 1.7, 0.7, 4.5, 255, 0, 0, 0, 90, 0);
        scene.addBox(13+x, 1.35, 13+z, 1.4, 0.8, 3.5, 255, 0, 0, 0, 90, 0);
        scene.addCylinder(14.25+x, 0.4, 13+z, 0.5, 2, 100, 100, 100, 90, 0, 90, 1, 1, 1);
        scene.addCylinder(11.75+x, 0.4, 13+z, 0.5, 2, 100, 100, 100, 90, 0, 90, 1, 1, 1);
        //end make sedan (n->s)
    }
    
    /**
     * Method that takes the x and z coordinates of the center of the block
     * they are in and creates a building in a specific spot in relation to these coordinates
     * @param scene - the Scene3D object the building will be written too
     * @param x - the x coordinates of the center point of the city block being built
     * @param z - the z coordinates of the center point of the city block being built
     */
    
    public static void makeBuilding(Scene3D scene, int x, int z) {
        //make building
        scene.addBox(17+x, 12, 2+z, 5, 24, 8, 100, 100, 100);
        //end make building
    }
    
    /**
     * Method that takes the x and z coordinates of the center of the block
     * they are in and creates a street sign in relation to these coordinates
     * @param scene - the Scene3D object the street sign will be written too
     * @param x - the x coordinates of the center point of the city block being built
     * @param z - the z coordinates of the center point of the city block being built
     */
    
    public static void makeStreetSign(Scene3D scene, int x, int z) {
         //make street sign
        scene.addCylinder(15+x, 1.5, 9+z, 0.1, 3, 0, 0, 0);
        scene.addBox(15+x, 3, 9+z, 0.1, 1, 1, 200, 0, 0);
        //end make street sign
    }
    
    /**
     * method that is exclusively used by the makeArtBlock method that places cows
     * in the road throughout the city blocks being created
     * @param scene - the Scene3D object that these cows are being written too
     * @param x - the x coordinate of the center of the city block this cow is being added too
     * @param z - the z coordinate of the center of the city block this cow is being added too
     */
    public static void placeCowInRoad(Scene3D scene, int x, int z){
        scene.addSpecialMesh("cow", 11+x, 1, 7+z, 0, x+z, 0, 1, 1, 1, 165, 0, 255);
    }
    
    /**
     * method that takes the desired x and z coordinates for the center of this new city block
     * then calls all the methods needed to create the said city block and fill it with the 
     * required road furniture, buildings, cars, etc.
     * @param scene - the Scene3D object the street sign will be written too
     * @param x = the x coordinates of the center point of this new city block
     * @param z - the z coordinates of the center point of this new city block
     */
    public static void makeBlock(Scene3D scene, int x, int z){
        
            MyScene.makefirehydrant(scene, x, z);
            MyScene.makeTree(scene, x, z);
            MyScene.makeStopLight(scene, x, z);
            MyScene.makeSedan(scene, x, z);
            MyScene.makeBuilding(scene, x, z);
            MyScene.makeStreetSign(scene, x,z);
        
    }
    
    /**
     * method that creates the scene that will be submitted for the art contest by
     * calling the necessary methods to populate the city with city blocks as well as 
     * the items that make up the park
     * @param scene - the Scene3D object that the art contest submission will be created in
     * @param x - the x coordinate for the center of which ever block is being created in the city
     * @param z - the z coordinate for the center of which ever block is being created in the city
     */
    
    public static void makeArtBlock(Scene3D scene, int x, int z){
        
            MyScene.makefirehydrant(scene, x, z);
            MyScene.makeTree(scene, x, z);
            MyScene.makeStopLight(scene, x, z);
            MyScene.makeSedan(scene, x, z);
            MyScene.makeBuilding(scene, x, z);
            MyScene.makeStreetSign(scene, x, z);
            MyScene.placeCowInRoad(scene, x, z);
            
            //start make park ground
            scene.addBox(-20, 0, -20, 40, 0.02, 40, 0, 128, 23);
            //end make park ground
            
            //start make prof tralie sculpture
            scene.addBox(-20, 2, -20, 4, 4, 4, 200, 200, 200);
            scene.addCylinder(-20, 6, -20, 2, 4, 200, 200, 200);
            scene.addSpecialMesh("proftralie", -20, 10.5, -20, 0, 0, 0, 2, 2, 2, 100, 100, 100);
            //end make prof tralie sculpture
            
            //start populate park w/trees
            //start border trees
            int a = 0;
            while(a>-40){
                MyScene.makeParkTree(scene, -40, a);
                MyScene.makeParkTree(scene, a, -40);
                a = a-5;
            }
            //end border trees
            //end populate park w/trees
            
            //start populate park w/cows
            scene.addSpecialMesh("cow", -5, 1, 12, 0, 0, 0, 1, 1, 1, 0, 255, 255);
            scene.addSpecialMesh("cow", -21, 1, 7, 0, x+z, 0, 1, 1, 1, 165, 0, 255);
            scene.addSpecialMesh("cow", 11+x, 1, 7+z, 0, x+z, 0, 1, 1, 1, 165, 0, 255);
            scene.addSpecialMesh("cow", -5, 1, -17, 0, 0, 0, 1, 1, 1, 0, 255, 255);
            scene.addSpecialMesh("cow", -21, 1, -11, 0, x*z, 0, 1, 1, 1, 165, 0, 255);
            scene.addSpecialMesh("cow", -11, 1, -7, 0, x*z, 0, 1, 1, 1, 165, 0, 255);
            
        
    }
    
    public static void drawScene(int numBlocks) {
        Scene3D scene = new Scene3D();
        scene.addCamera(0, 2, 0, 0);
        scene.addCamera(0, 2, -4, 180);
        scene.addLight(0, 100, 0, 1, 1, 1);
        scene.addLight(0, -100, 0, 1, 1, 1);
        scene.addLight(-100, 100, 0, 1, 1, 1);
        scene.addLight(100, -100, 0, 1, 1, 1);
        
        // Add a large gray box for the ground
        scene.addBox(0, -25, 0, 1000, 50, 1000, 127, 127, 127);
        
        // TODO: Fill this in
        for(int x = 0; x<=numBlocks; x++){
            for(int z = 0; z<=numBlocks; z++){
                int a = x*20;
                int b = z*20;
                makeBlock(scene, a, b);
            }
        }
        
        
        
        
        scene.saveScene("myscene.json", "Scene Title");
    }
    
    /**
     * Draw your art contest submission
     */
    public static void drawArtContest(int numBlocks) {
        Scene3D scene = new Scene3D();
        scene.addCamera(0, 2, 0, 0);
        // TODO: Fill this in
        
        scene.addCamera(0, 2, 0, 0);
        scene.addCamera(0, 2, -4, 180);
        scene.addLight(0, 100, 0, 1, 1, 1);
        scene.addLight(0, -100, 0, 1, 1, 1);
        scene.addLight(-100, 100, 0, 1, 1, 1);
        scene.addLight(100, -100, 0, 1, 1, 1);
        
        // Add a large gray box for the ground
        scene.addBox(0, -25, 0, 1000, 50, 1000, 127, 127, 127);
        
        // TODO: Fill this in
        for(int x = 0; x<=numBlocks; x++){
            for(int z = 0; z<=numBlocks; z++){
                int a = x*20;
                int b = z*20;
                makeArtBlock(scene, a, b);
            }
        }
        
        
        
        
        scene.saveScene("artcontest.json", "Scene Title");
    }
    
    public static void main(String[] args) {
        drawScene(5);
        drawArtContest(1);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choose.your.own.adventure;

/**
 *
 * @author btdou
 */
public class Chapter {
    private String[] Contents = new String[2];
    private boolean Status;
    
    /**
     * Constructor that creates new object of type Chapter
     * @param x - Subtitle of this chapter of the book - also the key for HashMap
     * @param y - Contents of this chapter of the book - also has the next steps for user to input
     * @param whatNext - boolean that if true user can continue on throughout book - if false, loop breaks out and that is the end of the story
     */
    public Chapter(String x, String y, boolean whatNext){
        Contents[0] = x;
        Contents[1] = y;
        Status = whatNext;
    }
    
       
    public String getPlot(){
        return Contents[0];
    }
    
    public String getOptions(){
        return Contents[1];
    }
    
    public boolean getStatus(){
        return Status;
    }
    
}

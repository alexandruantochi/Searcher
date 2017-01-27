/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.searcher;

/**
 *
 * @author C312044
 */
public final class Text {
    private static final String HELP_CONTENTS="Help Contents \n"
            + "\n\nSearch All - searches for all occurances in the file and displays them after reaching end of file; "
            + "this is slower as it needs to go thorugh the whole file. Inactive by default."
            + "\n\nShow Time Elapsed - shows how much time in seconds it took to find the string occurance/all occurances. Active by default"
            + "\n\nFast Mode - when deactivated, it provides with a Progress Bar, but takes time to process the file; "
            + "once it's deactivated, the processed file information is stored and activating it will not increase or decrease"
            + "performance. Active by default.";
    
    private static final String ABOUT="https://github.com/alexandruantochi";
    
    public final static String getHelpContents(){
        return Text.HELP_CONTENTS;
    }
    
    public final static String  getAbout(){
        return Text.ABOUT;
    }
}
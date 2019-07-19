/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trying.io;

import java.util.ArrayList;



/**
 *
 * @author majd1
 */


//This class for dealing with text written by the user and list of errors from the GUI application


public class BasicClass {
 
    private String userText;
    private ArrayList<String> listOfError;
    
    // this method is used to create object of the basic class 
    public BasicClass(String userText, ArrayList<String> listOFError) {
        this.userText = userText;
        this.listOfError = listOFError;
    }


}

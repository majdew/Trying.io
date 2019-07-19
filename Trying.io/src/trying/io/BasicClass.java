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
public class BasicClass {
    private String userText;
    private ArrayList<String> listOfError;

    
    
    // this method is used to create object of the basic class 
    public BasicClass(String userText, ArrayList<String> listOFError) {
        this.userText = userText;
        this.listOfError = listOfError;
    }

    
    //this method is used to return the text written by the user
    public String getUserText() {
        return userText;
    }

    
    //this method is used to assign the text written by the user to the member varriable userText
    public void setUserText(String userText) {
        this.userText = userText;
    }

    
    //this method is used to return a list of errors which the user  made
    public ArrayList<String> getListOFError() {
        return listOfError;
    }
    //this method is used to assign the list of errors  written by the user to the member varriable listOFError 
    public void setListOFError(ArrayList<String> listOFError) {
        this.listOfError = listOFError;
    }
    
    
    
    
    
    
}

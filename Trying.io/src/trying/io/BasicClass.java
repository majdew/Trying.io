/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trying.io;

import java.util.ArrayList;



/**
 *This class for dealing with the typed characters  written by the user and list of errors from the GUI application
 * there is a a method for initialize the member variables , set and get the value of each member variable 
 * method for counts number of words per minute  and  listing the errors .
 * @author majd1
 */


//


public class BasicClass {
 
    
    private ArrayList<String> listOfError;
    
    // this method is used to create object of the basic class 
    public BasicClass(String userText, ArrayList<String> listOFError) {
 
        this.listOfError = listOFError;
    }
    
 

    


    
    //this method is used to return a list of errors which the user  made
    public ArrayList<String> getListOfError() {
        return listOfError;
    }
    //this method is used to assign the list of errors  written by the user to the member varriable listOFError 
    public void setListOFError(ArrayList<String> listOfError) {
        this.listOfError = listOfError;
    }


}

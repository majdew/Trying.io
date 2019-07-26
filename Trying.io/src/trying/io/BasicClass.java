/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trying.io;

import java.util.ArrayList;
import java.util.HashMap;



/**
 *This class for dealing with the typed characters  written by the user and list of errors from the GUI application
 * there is a a method for initialize the member variables , set and get the value of each member variable 
 * method for counts number of words per minute  and  listing the errors .
 * @author majd1
 */


//


public class BasicClass {
 
    private ArrayList<Character> userTypedChars;
    private HashMap<Character,Integer> charErrors;
    private int numberOfTypedChars;
    
    
    // method for return all typed characters 
    public ArrayList<Character> getUserTypedChars() {
        return userTypedChars;
    }
    // method for assign value to the member variable userTypedChars
    public void setUserTypedChars(ArrayList<Character> userTypedChars) {
        this.userTypedChars = userTypedChars;
    }
    // method that returns all uncorected errors as keys and values , key represent uncorected character and value number of error for each character
    public String getCharErrors() {
        String errorList="";
        for(Character key : charErrors.keySet())
            errorList=errorList+("Character<"+key+" >: "+this.charErrors.get(key)+" times\n");
        return errorList;          
    }
    
    // method for  setting list of errors the error as key and value that takes uncorrected char (key) and  check if the character exist in the map it increases the value by one else assigns the number of error equal 1
    public void setCharErrors(char errorChar) {
        if(charErrors.containsKey(errorChar)){
             int numberOfError =charErrors.get(errorChar);
             charErrors.put(errorChar, numberOfError+1);
        }
        else{         
            charErrors.put(errorChar, 1);
        } 
    }
    
    //method that return integer represent number of typed characters takes no parameter
    public int getNumberOfTypedChars() {
        return numberOfTypedChars;
    }

    
    // method  that takes intger value as parameter represent number of typed characters and no return value
    public void setNumberOfTypedChars(int numberOfTypedChars) {
        this.numberOfTypedChars = numberOfTypedChars;
    }
    
    // this method is used to create object of the basic class 
    public BasicClass(String userText, ArrayList<String> listOFError) {
 
        
    }
    
 

    


    


}

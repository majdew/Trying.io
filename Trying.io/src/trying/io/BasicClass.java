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
    

    // member variable for storing user typed characters for compare it with orginal text characters and produce charErrors
    private ArrayList<Character> userTypedChars; 
    
    // member variable that store uncorrected character  as "key" and number of errors for each as "value"
    private HashMap<Character,Integer> charErrors;
    
    //member varible that stores number of all typed characters which needed for calculate number of words per minute and display in the result form
    private int numberOfTypedChars;
    
    // member variable that stores number of uncorrected characters needed for calculate number of words per minute  and display in the result form
    private int numberOfUncorrectChars;
    
    // member variable that stores number of words per minute which we calculatee from other member variables and display in the result form 
    private int numberOfWordsPerMin;
    
    
     // this method is used to create object of the basic class intialize the member no variables
    
        public BasicClass() {
        this.userTypedChars=new ArrayList<>();
        this.charErrors=new HashMap<>();
        this.numberOfUncorrectChars =0;
        this.numberOfWordsPerMin=0;
        this.numberOfTypedChars=0;
       
    }
        
        
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
    
    
    // method  that takes intger value as parameter represent number of typed characters and there is no return value
    
    public void setNumberOfTypedChars(int numberOfTypedChars) {
        this.numberOfTypedChars = numberOfTypedChars;
    }
    
    
    // method returns integer value represent number of uncorrected characters and takes no parameter 
   
    public int getNumberOfUncorrectChars() {
        return numberOfUncorrectChars;
    }

    
    // method that takes integer value represent number of uncorrected characters and there is no return value
   
    public void getNumberOfUncorrectChars(int NumberOfUncorrectChars) {
        this.numberOfUncorrectChars=numberOfUncorrectChars;
    }
    
    // method that returns integer value represent number of words per minute  and takes no parameter
    
    public int getNumberOfWordsPerMin() {
        return numberOfWordsPerMin;
    }
    

    //method for setting number of words per minute  using number of typed characters and number of uncorrected characters  no return value  
    
    public void setNumberOfWordsPerMin() {
        this.numberOfWordsPerMin = (numberOfTypedChars/5)-numberOfUncorrectChars;
    }
    
    
    // method has no return value takes arraylist of characters represent the orginal text it compare user typed chars with orginal chars set error list and number of uncorrected chars
  
    public void compare(ArrayList<Character>orginalText){
        if(userTypedChars.size()<=orginalText.size()){
            for (int i=0;i<userTypedChars.size();i++){
                if(!userTypedChars.get(i).equals(orginalText.get(i))){
                    numberOfUncorrectChars++;
                    char currentChar= orginalText.get(i);
                    setCharErrors(currentChar);
                }
            }
        }
        else if(orginalText.size()<userTypedChars.size()){
            int i;
            for(i=0;i<orginalText.size();i++){
                if(!userTypedChars.get(i).equals(orginalText.get(i)))
                    numberOfUncorrectChars++;
            }
            for(i=orginalText.size()-1;i<userTypedChars.size();i++){
                setCharErrors(userTypedChars.get(i));   
            }
        }
            
        }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
Comment for the class : Praneeth - 9/19/2016
This class is used for data validations. For this application the methods in this class are called to check the input values provided by the user.*/
package Business;


public class DataValidation {

    public boolean checkNumeric(String testval) 
    {
        try 
        {
            int temp = Integer.parseInt(testval);
        } 
        catch (NumberFormatException nfe) 
        {
            return false;
        }
        return true;
    }
    
    public boolean checkEmail(String emailval)
    {
        if(emailval.matches("^^(.+)@(.+)$"))
        {
         return true;   
        }
        return false;
    }
    public static boolean alphabetCheck(String checkString){
         if(checkString != null && checkString.matches("[a-zA-Z\\s]+")){
             return true;
         }
         return false;
     }
     
     public static boolean alphaNumericCheck(String checkString){
         if(checkString != null && checkString.matches("[a-zA-Z0-9\\s]+")){
             return true;
         }
         return false;
     }
     
     public static boolean numberWithSizeCheck(String checkString, int size){
         String reqEx = "[0-9]{"+ size +"}";
         if(checkString != null && checkString.matches(reqEx)){
             return true;
         }
         return false;
     }
}

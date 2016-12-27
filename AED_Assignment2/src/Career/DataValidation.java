/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
Comment for the class : Praneeth - 9/19/2016
This class is used for data validations. For this application the methods in this class are called to check the input values provided by the user.*/
package Career;

/**
 *
 * @author praneeth
 */
public class DataValidation {

    public boolean checkNumeric(String testval) {
        /* The input from the user is passed in the argument of this method. The value will be parsed to int. If its successful then the value is legit 
           and if it throws any exception a message box will be fired requesting user to re-check the values he populated in the textbox.*/
        try {
            int temp = Integer.parseInt(testval);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}

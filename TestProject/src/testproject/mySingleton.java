/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

/**
 *
 * @author prane
 */
public class mySingleton {
    
 private static mySingleton singletononobj;
 
    public static mySingleton getInstance()
    {
        if(singletononobj==null)
        singletononobj = new mySingleton();
        
        
        return singletononobj;
    }
}

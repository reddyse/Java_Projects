/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author prane
 */
public class TestProject {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) throws Exception {
        ArrayList<Color> ls = new ArrayList<>();

        Question1();
        //ls = removeBlues(ls);
        //System.out.println(ls.size());
//        boolean val = checkPallindrome("live       evil");
//        System.out.println(val);
        //System.out.println(computeFactorial(8));

    }

    public static void Question1() {
        // TODO code application logic here
        ArrayList<Car> cars = null;// Will not be part of the answer.
        try {
            if (cars != null) {
                for (Car car : cars) {
                    if (car != null) {
                        car.drive();
                    }
                }

            } else {
                System.out.println("Your list is empty");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong. Please see the system returned message : " + e.getMessage());
        }
    }

    public static ArrayList<Color> removeBlues(ArrayList<Color> inputColors) {
        final String COLORBLUE = "blue";
        ArrayList<Color> noBlueList = new ArrayList<>();
        try {
            if (inputColors != null && !inputColors.isEmpty()) {
                for (Color color : inputColors) {
                    if (color != null) {
                        if (!color.getName().equalsIgnoreCase(COLORBLUE)) {
                            noBlueList.add(color);
                        }
                        if (inputColors.isEmpty()) {
                            return noBlueList;

                        }
                    }

                }
            } else {
                System.out.println("Your list is empty");
            }

        } catch (Exception e) {
            System.out.println("Something went wrong. Please see the system returned message : " + e.getMessage());

        }
        return noBlueList;
    }

    public static int computeFactorial(int number) throws Exception {

        int factorial = 1;
        try {
            if (number > 0) {
                for (int i = 1; i <= number; i++) {
                    factorial = factorial * i;

                }
            } else if (number == 0) {
                return factorial;
            } else {
                throw new Exception("Factorial cannot be calculated. Please check the input");
            
            }
            return factorial;
        } catch (Exception e) {
            System.out.println("Something went wrong. Please see the system returned message : " + e.getLocalizedMessage());
            return -1;
        }

        
    }

    public static boolean checkPallindrome(String str) {
        int arrpos = 0;
        str = str.toLowerCase();
        //str = str.replace(" ", "");
        str = str.replaceAll("[,./? ]", "");

        try {
            if (str != null) {
                char[] chararr = str.toCharArray();
                for (char charval : chararr) {
                    if (Character.isDigit(charval)) {
                        return false;
                    }
                    if (charval != chararr[chararr.length - 1 - arrpos]) {
                        return false;
                    }
                    arrpos++;
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong. Please see the system returned message : " + e.getMessage());
        }
        return true;
    }

}

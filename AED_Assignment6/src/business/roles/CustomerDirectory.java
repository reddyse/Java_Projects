/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import business.roles.Customer;
import java.util.ArrayList;

/**
 *
 * @author prane
 */
public class CustomerDirectory 
{
      private ArrayList<Customer> customerDirectory;

    public CustomerDirectory() 
    {
    }
       
    public Customer addCustomerDirectory(Customer customer) 
    {
        customerDirectory.add(customer);
        return customer;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author prane
 */
public class ProductCatalog 
{
  private ArrayList<Product> productCatalog;
    
    public ProductCatalog() 
    {
        productCatalog=new ArrayList<>();
    }

    public ArrayList<Product> getProductCatalog() 
    {
        return productCatalog;
    
    }
    
    public Product addProduct()
    {
        Product p = new Product();
        productCatalog.add(p);
        return p;
        
    }
    
    public void removeProduct(Product p)
    {
        productCatalog.remove(p);   
    }
    
    public Product searchProduct(int id)
    {
        for (Product p:productCatalog)
        {
            if(p.getModelNumber()==id)
            {
                return p;
            }
        }
        return null;
    }
  
}
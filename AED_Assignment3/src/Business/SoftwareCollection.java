
package Business;

import java.util.ArrayList;

public class SoftwareCollection 
{
    private ArrayList<Product> softwareList;

     public SoftwareCollection() 
     {
        this.softwareList=new ArrayList <Product> ();
     }
    
     public ArrayList<Product> getSoftwareList() 
     {
        ArrayList<Product> softwaretempList = new ArrayList<>();
         for(Product product: softwareList)
        {
          if(product.getPtype().equals("Software"))
            {
              softwaretempList.add(product);
            }
        }
         return softwaretempList;
     }
     
     public Product updateProduct(String productid)
     {
          for(Product product: softwareList)
        {
          if(product.getPid().equals(productid))
            {
              softwareList.remove(product);  
              
            }
        }
        Product product = new Product();
        softwareList.add(product);
        return product;
     }
     
     public void setSoftwareList(ArrayList<Product> softwareList) 
     {
        this.softwareList = softwareList;
     }
     public Product addProduct()
    {
        Product product = new Product();
        softwareList.add(product);
        return product;
    }
     public boolean deleteProduct(String productid, String productname, String productmodel)
    {
         for(Product product: softwareList)
        {
            if(product.getPid().equals(productid))
            {
                softwareList.remove(product);
                return true;
            }
            else if(product.getPname().equals(productname))
            {
                softwareList.remove(product);
                return true;
            }
            else if(product.getPmodel().equals(productmodel))
            {
                softwareList.remove(product);
                return true;
            }
        }
        return false;
        
    }
     public ArrayList<Product> searchProduct(String productid, String productname, String productmodel)
    {
        ArrayList<Product> compcol=new ArrayList<>();
        for(Product product: softwareList)
        {
            if(product.getPid().equals(productid))
            {
                compcol.add(product);
            }
            else if(product.getPname().equals(productname))
            {
                compcol.add(product);
            }
            else if(product.getPmodel().equals(productmodel))
            {
                compcol.add(product);
            }
        }
        return compcol;
    }
}


package Business;

import java.util.ArrayList;

public class HardwareCollection 
{
    private ArrayList<Product> hardwareList;

     public HardwareCollection() 
     {
        this.hardwareList=new ArrayList <Product> ();
     }
    
     public ArrayList<Product> getHardwareList() 
     {
       ArrayList<Product> hardwaretempList = new ArrayList<>();
         for(Product product: hardwareList)
        {
          if(product.getPtype().equals("Hardware"))
            {
              hardwaretempList.add(product);
            }
        }
         return hardwaretempList;
     }
     
     public Product updateProduct(String productid)
     {
          for(Product product: hardwareList)
        {
          if(product.getPid().equals(productid))
            {
              hardwareList.remove(product);  
              
            }
        }
        Product product = new Product();
        hardwareList.add(product);
        return product;
     }
     
     public void setHardwareList(ArrayList<Product> hardwareList) 
     {
        this.hardwareList = hardwareList;
     }
     public Product addProduct()
    {
        Product product = new Product();
        hardwareList.add(product);
        return product;
    }
     public boolean deleteProduct(String productid, String productname, String productmodel)
    {
         for(Product product: hardwareList)
        {
            if(product.getPid().equals(productid))
            {
                hardwareList.remove(product);
                return true;
            }
            else if(product.getPname().equals(productname))
            {
                hardwareList.remove(product);
                return true;
            }
            else if(product.getPmodel().equals(productmodel))
            {
                hardwareList.remove(product);
                return true;
            }
        }
        return false;
        
    }
     public ArrayList<Product> searchProduct(String productid, String productname, String productmodel)
    {
        ArrayList<Product> compcol=new ArrayList<>();
        for(Product product: hardwareList)
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

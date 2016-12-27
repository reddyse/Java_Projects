
package Business;

import java.util.ArrayList;

public class ComputerCollection 
{
    private ArrayList<Product> computerList;

     public ComputerCollection() 
     {
        this.computerList=new ArrayList <Product> ();
     }
    
     public ArrayList<Product> getComputerList() 
     {
         ArrayList<Product> computertempList = new ArrayList<>();
         for(Product product: computerList)
        {
          if(product.getPtype().equals("Computer"))
            {
              computertempList.add(product);
            }
        }
         return computertempList;
     
     }
     
     public Product updateProduct(String productid)
     {
         Product p=null;
          for(Product product: computerList)
        {
          if(product.getPid().equals(productid))
            {
              computerList.remove(product);  
              computerList.add(product);
              p=product;
            }
        }  
        return p;
     }
     
     public void setComputerList(ArrayList<Product> computerList) 
     {
        this.computerList = computerList;
     }
     public Product addProduct()
    {
        Product product = new Product();
        computerList.add(product);
        return product;
    }
     public boolean deleteProduct(String productid, String productname, String productmodel)
    {
         for(Product product: computerList)
        {
            if(product.getPid().equals(productid))
            {
                computerList.remove(product);
                return true;
            }
            else if(product.getPname().equals(productname))
            {
                computerList.remove(product);
                return true;
            }
            else if(product.getPmodel().equals(productmodel))
            {
                computerList.remove(product);
                return true;
            }
        }
        return false;
        
    }
     public ArrayList<Product> searchProduct(String productid, String productname, String productmodel)
    {
        ArrayList<Product> compcol=new ArrayList<>();
        for(Product product: computerList)
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

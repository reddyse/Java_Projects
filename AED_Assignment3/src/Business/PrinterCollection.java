
package Business;

import java.util.ArrayList;

public class PrinterCollection 
{
    private ArrayList<Product> printerList;

     public PrinterCollection() 
     {
        this.printerList=new ArrayList <Product> ();
     }
    
     public ArrayList<Product> getPrinterList() 
     {
        ArrayList<Product> printertempList = new ArrayList<>();
         for(Product product: printerList)
        {
          if(product.getPtype().equals("Printer"))
            {
              printertempList.add(product);
            }
        }
         return printertempList;
     }
     
     public Product updateProduct(String productid)
     {
          for(Product product: printerList)
        {
          if(product.getPid().equals(productid))
            {
              printerList.remove(product);  
              
            }
        }
        Product product = new Product();
        printerList.add(product);
        return product;
     }
     
     public void setPrinterList(ArrayList<Product> printerList) 
     {
        this.printerList = printerList;
     }
     public Product addProduct()
    {
        Product product = new Product();
        printerList.add(product);
        return product;
    }
     public boolean deleteProduct(String productid, String productname, String productmodel)
    {
         for(Product product: printerList)
        {
            if(product.getPid().equals(productid))
            {
                printerList.remove(product);
                return true;
            }
            else if(product.getPname().equals(productname))
            {
                printerList.remove(product);
                return true;
            }
            else if(product.getPmodel().equals(productmodel))
            {
                printerList.remove(product);
                return true;
            }
        }
        return false;
        
    }
     public ArrayList<Product> searchProduct(String productid, String productname, String productmodel)
    {
        ArrayList<Product> compcol=new ArrayList<>();
        for(Product product: printerList)
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author prane
 */
public class Supplier 
{
 
    private String supplierName;
    private ProductCatalog productCatalog;

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public Supplier()
    {
        productCatalog=new ProductCatalog();
    }
    
    @Override
    public String toString()
    {
        return supplierName;
    }   
}
    
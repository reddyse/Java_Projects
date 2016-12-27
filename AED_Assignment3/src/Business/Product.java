/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import javax.swing.ImageIcon;

public class Product 
{
    private String pid;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getPmodel() {
        return pmodel;
    }

    public void setPmodel(String pmodel) {
        this.pmodel = pmodel;
    }

    public String getPmodelid() {
        return pmodelid;
    }

    public void setPmodelid(String pmodelid) {
        this.pmodelid = pmodelid;
    }

    public String getPdescription() {
        return pdescription;
    }

    public void setPdescription(String pdescription) {
        this.pdescription = pdescription;
    }

    public String getPvendorname() {
        return pvendorname;
    }

    public void setPvendorname(String pvendorname) {
        this.pvendorname = pvendorname;
    }

    public String getPbaseprice() {
        return pbaseprice;
    }

    public void setPbaseprice(String pbaseprice) {
        this.pbaseprice = pbaseprice;
    }

    public String getPceilingprice() {
        return pceilingprice;
    }

    public void setPceilingprice(String pceilingprice) {
        this.pceilingprice = pceilingprice;
    }

    public String getPfloorprice() {
        return pfloorprice;
    }

    public void setPfloorprice(String pfloorprice) {
        this.pfloorprice = pfloorprice;
    }

    public String getPfeatures() {
        return pfeatures;
    }

    public void setPfeatures(String pfeatures) {
        this.pfeatures = pfeatures;
    }

    public String getPbenefits() {
        return pbenefits;
    }

    public void setPbenefits(String pbenefits) {
        this.pbenefits = pbenefits;
    }

   public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public String getCselection() {
        return cselection;
    }

    public void setCselection(String cselection) {
        this.cselection = cselection;
    }

    public String getCtimestamp() {
        return ctimestamp;
    }

    public void setCtimestamp(String ctimestamp) {
        this.ctimestamp = ctimestamp;
    }

    public String getPvendorid() {
        return pvendorid;
    }

    public void setPvendorid(String pvendorid) {
        this.pvendorid = pvendorid;
    }

    public String getPvendortimestamp() {
        return pvendortimestamp;
    }

    public void setPvendortimestamp(String pvendortimestamp) {
        this.pvendortimestamp = pvendortimestamp;
    }
    private String pname;
    private String ptype;
    private String pmodel; 
    private String pmodelid;
    private String pdescription;
    private String pvendorname;
    private String pbaseprice;
    private String pceilingprice;
    private String pfloorprice;
    private String pfeatures;
    private String pbenefits;
    private ImageIcon  image;
    
    private String cselection;
    private String ctimestamp;
    
    private String pvendorid;
    private String pvendortimestamp;
    
    @Override
public String toString()
{
    return pname;
}
}

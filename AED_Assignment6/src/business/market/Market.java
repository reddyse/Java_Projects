/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.market;

/**
 *
 * @author prane
 */
public class Market 
{
    private SubMarketDirectory subMarketDirectory;
    private String marketName;
    private String marketSize;
    private String marketID;

    public SubMarketDirectory getSubMarketDirectory() {
        return subMarketDirectory;
    }

    public void setSubMarketDirectory(SubMarketDirectory subMarketDirectory) {
        this.subMarketDirectory = subMarketDirectory;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getMarketSize() {
        return marketSize;
    }

    public void setMarketSize(String marketSize) {
        this.marketSize = marketSize;
    }

    public String getMarketID() {
        return marketID;
    }

    public void setMarketID(String marketID) {
        this.marketID = marketID;
    }

    public String getBenifits() {
        return benifits;
    }

    public void setBenifits(String benifits) {
        this.benifits = benifits;
    }

    public String getChannels() {
        return channels;
    }

    //customer types
    public void setChannels(String channels) {
        this.channels = channels;
    }
    //market segments
    //characteristics
    private String benifits;
    private String channels;
    
     public Market()
    {
    this.subMarketDirectory=new SubMarketDirectory();
    
    }

    
}

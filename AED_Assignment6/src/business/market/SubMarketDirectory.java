/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.market;

import java.util.ArrayList;

/**
 *
 * @author prane
 */
public class SubMarketDirectory {

    public ArrayList<SubMarket> getSubMarketList() {
        return subMarketList;
    }

    public void setSubMarketList(ArrayList<SubMarket> subMarketList) {
        this.subMarketList = subMarketList;
    }
    private ArrayList<SubMarket> subMarketList;
     public SubMarketDirectory()
    {
        this.subMarketList=new ArrayList<>();
    }
     
     public SubMarket addHouse(MarketDirectory marketDirectory, Market market) 
    {   
        SubMarket submarket = new SubMarket();
        market.getSubMarketDirectory().getSubMarketList().add(submarket);
        return submarket;
    }
    
}

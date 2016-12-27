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
public class SubMarket extends Market {
    private String subMarketID;
    
    private ArrayList<StateLevelMarket> stateLevelMarketList;

    public String getSubMarketID() {
        return subMarketID;
    }

    public void setSubMarketID(String subMarketID) {
        this.subMarketID = subMarketID;
    }

    public ArrayList<StateLevelMarket> getStateLevelMarketList() {
        return stateLevelMarketList;
    }

    public void setStateLevelMarketList(ArrayList<StateLevelMarket> stateLevelMarketList) {
        this.stateLevelMarketList = stateLevelMarketList;
    }

    
public SubMarket()
{
this.stateLevelMarketList=new ArrayList<>();
}
    
}

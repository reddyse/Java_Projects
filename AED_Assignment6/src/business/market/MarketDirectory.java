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
public class MarketDirectory {
        private ArrayList<Market> marketDirectory;
    
        
        public Market addCommunity() {
        Market market=new Market();
        marketDirectory.add(market);
        return market;
    }
}

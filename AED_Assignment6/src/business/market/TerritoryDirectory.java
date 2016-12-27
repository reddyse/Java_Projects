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
public class TerritoryDirectory {
    private ArrayList<Territory> territoryDirectory;
    
    public TerritoryDirectory()
    {
    territoryDirectory=new ArrayList<>();
    }
    
      public Territory addTerritory(Territory territory) {
        territoryDirectory.add(territory);
        return territory;
    }
}

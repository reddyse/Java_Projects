/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author prane
 */

/*This class is responsible to manage the array list that we are creating to manage the vitals that are recorded. The values are stored in displayed
  the user using the JTable with the functionalities of Add and Remove the data.*/
public class VitalSignHistory {
    private ArrayList<VitalSigns> vitalSignHistory;

    public VitalSignHistory() {
        
        //this.vitalSignHistory = vitalSignHistory;
        vitalSignHistory = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    public VitalSigns addVitals()
    {
        VitalSigns vs = new VitalSigns();
        vitalSignHistory.add(vs);
        return vs;
    }
    
    public void deleteVitals(VitalSigns v)
    {
        vitalSignHistory.remove(v);
    }
    
}

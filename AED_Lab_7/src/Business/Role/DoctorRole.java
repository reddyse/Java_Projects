/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import business.roles.Business;
import business.roles.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author prane
 */
public class DoctorRole extends Role {
    @Override
    public abstract JPanel createWorkArea(JPanel userProcessCOntainer, UserAccount account, Organization organization, Business business);
    
}

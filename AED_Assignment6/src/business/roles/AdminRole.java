/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import lab7.Business;
import lab7.Role;
import javax.swing.JPanel;

/**
 *
 * @author prane
 */
public class AdminRole extends Role {
    @Override
    public abstract JPanel createWorkArea(JPanel userProcessCOntainer, UserAccount account, Organization organization, Business business);
    
    
}

package Business.Role;

import business.roles.Business;
import business.roles.UserAccount;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prane
 */
public abstract class Role {
    public enum RoleTZype
    {
        Admin("Admin");
        Doctor("Doctor");
        LabAssistant("Lab Assistant");
        
        private String value;
        private RoleType(String value)
        {
            this.value=value;   
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessCOntainer, UserAccount account, Organization organization, Business business);
    
    @Override
    public String toString()
    {
        return this.getClass().getName();
    }
}

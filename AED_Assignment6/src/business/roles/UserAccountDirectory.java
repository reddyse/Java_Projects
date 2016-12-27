/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import java.util.ArrayList;

/**
 *
 * @author prane
 */
public class UserAccountDirectory 
{
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();

    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }

    public UserAccount addUser() {
        UserAccount u = new UserAccount();
        userAccountList.add(u);
        return u;

    }

    public void removeUser(UserAccount u) {
        userAccountList.remove(u);
    }
    
}

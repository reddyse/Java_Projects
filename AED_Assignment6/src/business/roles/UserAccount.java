/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

/**
 *
 * @author prane
 */
public class UserAccount {
     public static String ADMIN_ROLE = "Admin";
    public static String EMPLOYEE_ROLE = "Employee";
    private static int count = 1000;
    private int userId;
    private String userName;
    private String password;
    private String role;
    private Boolean isActive;
    private Person person;

    public UserAccount() {
        userId = count++;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return person.getFirstName()+" "+person.getLastName();
    }
    
}

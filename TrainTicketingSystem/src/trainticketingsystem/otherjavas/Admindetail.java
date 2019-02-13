/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainticketingsystem.otherjavas;

/**
 *
 * @author Mila
 */
public class Admindetail {
     private String username;
     private String password;
     
     
     public Admindetail(String username, String password) {
        this.username = username;
        this.password = password;
    }
     
      public String getusername() {
        return username;
    }
      
       public String getpassword() {
        return password;
    }
    
    

}

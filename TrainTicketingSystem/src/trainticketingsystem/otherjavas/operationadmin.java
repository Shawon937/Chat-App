/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainticketingsystem.otherjavas;

import trainticketingsystem.otherjavas.DBConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import trainticketingsystem.otherjavas.Admindetail;



/**
 *
 * @author Mila
 */
public class operationadmin {
    
    private DBConnect dbc;
    private ResultSet rs; 
    
    public void operationadmin()
    {
        
    }
    
    public void saveInvoice(Admindetail ade) throws ClassNotFoundException
    {   System.out.println("ghk ");       
        try{
         dbc = new DBConnect();
         dbc.connectToDB();   
         
         String uname = ade.getusername();
         String pass = ade.getpassword();
    
         System.out.println("username"+ uname);
         System.out.println("password "+ pass);
        

         //Boolean dataSaved = dbc.insertDataToDB("INSERT INTO Student(firstName, lastName, year)"
          //                                  + " VALUES("+stu.getFirstName()+", "+stu.getLastName()+", "+stu.getYear()+")");
         Boolean dataSaved = dbc.insertDataToDB("INSERT INTO admindetails(username, passwordfield)"
                                            + " VALUES('"+ade.getusername()+"', '"+ade.getpassword()+"')");
                              
         System.out.println("save or not "+ dataSaved);
         dbc.disconnectFromDB();            
     }
       catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }finally {closeDB();}

    } 
    
 private void closeDB()
{
    try{
        if (rs != null){rs.close();}
       // if (stmt != null){stmt.close();}
        //if (dbc != null){dbc.close();}
    }catch(Exception e){}
}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainticketingsystem.otherjavas;

import java.sql.ResultSet;
import java.sql.SQLException;
import trainticketingsystem.otherjavas.DBConnect;
import trainticketingsystem.otherjavas.Passengerdetail;

/**
 *
 * @author Mila
 */
public class Operationpassenger {
    
     private DBConnect dbc;
     private ResultSet rs; 
     
     public void Operationpassenger()
     {
         
     }
     
     
     public void saveInvoice(Passengerdetail pde) throws ClassNotFoundException
    {   System.out.println("yaaay!!! ");       
        try{
         dbc = new DBConnect();
         dbc.connectToDB();   
         
        
         String passengername = pde.getpassengername();
         Integer passengerId = pde.getpassengerId();
    
         System.out.println("PassengerName"+ passengername);
         System.out.println("PassengerID"+ passengerId);
        
        

         //Boolean dataSaved = dbc.insertDataToDB("INSERT INTO Student(firstName, lastName, year)"
          //                                  + " VALUES("+stu.getFirstName()+", "+stu.getLastName()+", "+stu.getYear()+")");
         Boolean dataSaved = dbc.insertDataToDB("INSERT INTO passengerdetails(passengername,passengerid,trainid,numberofbookedtickets)"
                                            +" VALUES('"+pde.getpassengername()+"',"+pde.getpassengerId()+","+pde.gettrainId()+","+pde.getnumofbookedticket()+")");
         System.out.println("save or not "+ dataSaved);
         dbc.disconnectFromDB();            
     }
       catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }finally {closeDB();
        }
        
        
    
    
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

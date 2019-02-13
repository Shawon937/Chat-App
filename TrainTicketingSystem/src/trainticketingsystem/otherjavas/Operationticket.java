/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainticketingsystem.otherjavas;

import java.sql.ResultSet;
import java.sql.SQLException;
import trainticketingsystem.otherjavas.DBConnect;
import trainticketingsystem.otherjavas.Ticketdetail;

/**
 *
 * @author Mila
 */
public class Operationticket {
     private DBConnect dbc;
     private ResultSet rs; 
     
     public void Operationticket()
     {
         
     }
     
      public void saveInvoice(Ticketdetail tcde) throws ClassNotFoundException
    {   System.out.println("yaaay!!! ");       
        try{
         dbc = new DBConnect();
         dbc.connectToDB();   
         
         Integer id = tcde.gettrainId();
         Integer ticketid = tcde.getticketId();
         Integer price = tcde.getprice();
         String ticketclass = tcde.getticketclass();
    
         System.out.println("ID"+ id);
         System.out.println("ticketid"+ ticketid);
         System.out.println("price"+ price);
         System.out.println("ticketclass"+ ticketclass);
        

         //Boolean dataSaved = dbc.insertDataToDB("INSERT INTO Student(firstName, lastName, year)"
          //                                  + " VALUES("+stu.getFirstName()+", "+stu.getLastName()+", "+stu.getYear()+")");
         Boolean dataSaved = dbc.insertDataToDB("INSERT INTO ticketdetails(trainid,ticketid,price,class)"
                                            +" VALUES("+tcde.gettrainId()+", "+tcde.getticketId()+","+tcde.getprice()+",'"+tcde.getticketclass()+"')");
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

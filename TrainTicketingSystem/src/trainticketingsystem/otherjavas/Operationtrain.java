/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainticketingsystem.otherjavas;

import java.sql.ResultSet;
import java.sql.SQLException;
import trainticketingsystem.otherjavas.DBConnect;
import trainticketingsystem.otherjavas.Traindetail;

/**
 *
 * @author Mila
 */
public class Operationtrain {
    
     private DBConnect dbc;
     private ResultSet rs; 
     
     public void Operationtrain()
     {
         
     }
     
     public void saveInvoice(Traindetail tde) throws ClassNotFoundException
    {   System.out.println("yaaay!!! ");       
        try{
         dbc = new DBConnect();
         dbc.connectToDB();   
         
         Integer id = tde.gettrainId();
         Integer quantity = tde.getticketavailable();
         String src = tde.getsource();
         String dstn = tde.getdestination();
         String date = tde.getdate();
    
         System.out.println("ID"+ id);
         System.out.println("quantity"+ quantity);
         System.out.println("source"+ src);
         System.out.println("destination"+ dstn);
         System.out.println("date"+ date);
        

         //Boolean dataSaved = dbc.insertDataToDB("INSERT INTO Student(firstName, lastName, year)"
          //                                  + " VALUES("+stu.getFirstName()+", "+stu.getLastName()+", "+stu.getYear()+")");
         Boolean dataSaved = dbc.insertDataToDB("INSERT INTO traindetails(trainid,quantity,sourcestation,destinationstation,ticketdate)"
                                            +" VALUES("+tde.gettrainId()+", "+tde.getticketavailable()+", '"+tde.getsource()+"','"+tde.getdestination()+"','"+tde.getdate()+"')");
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

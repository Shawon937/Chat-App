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
public class Passengerdetail {
    
     private String passengername;
      private int passengerId;
     private int trainId;
     private int numofbookedtickets;
     
     
     public Passengerdetail(String passengername, int passengerId, int trainId , int numofbookedtickets) {
        this.passengername = passengername;
        this.passengerId =passengerId;
        this.trainId = trainId;
        this.numofbookedtickets = numofbookedtickets;
    }

   
     
      public String getpassengername() {
        return passengername;
    }
      
       public int getpassengerId() {
        return passengerId;
    }
        public int gettrainId() {
        return trainId;
    }
        
         public int getnumofbookedticket() {
        return numofbookedtickets;
    }
        
    
}

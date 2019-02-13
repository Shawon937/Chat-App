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
public class Ticketdetail {
    
      private int trainId;
      private int ticketId;
      private int price;
      private String ticketclass;
      
       public Ticketdetail(int trainId , int ticketId ,  int price , String ticketclass) {
        this.trainId = trainId;
        this.ticketId = ticketId;
        this.price = price;
        this.ticketclass= ticketclass; 
        
    }
       public int gettrainId() {
        return trainId;
    }
       
       public int getticketId() {
        return ticketId;
    }
       public int getprice() {
        return price;
    }
       public String getticketclass() {
        return ticketclass;
    }
    
}

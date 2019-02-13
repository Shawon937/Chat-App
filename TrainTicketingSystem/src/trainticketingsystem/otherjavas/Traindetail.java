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
public class Traindetail {
      private int trainId;
      private int ticketavailable;
      private String source;
      private String destination;
      private String date;
      
        public Traindetail(int trainId , int ticketavailable , String source, String destination, String date) {
        this.trainId = trainId;
        this.ticketavailable = ticketavailable;
        this.source = source;
        this.destination = destination; 
        this.date =date;
    }
        public int gettrainId() {
        return trainId;
    }
          public int getticketavailable() {
        return ticketavailable;
    }
     public String getsource() {
        return source;
    }
     public String getdestination() {
        return destination;
    }
       public String getdate() {
        return date;
    }
}

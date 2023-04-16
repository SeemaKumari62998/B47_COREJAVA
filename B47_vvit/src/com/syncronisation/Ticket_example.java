package com.syncronisation;

public class Ticket_example 
{ 
	private int tickets=2;
  public synchronized  void booktickets(int wanttickets) {
	  if (wanttickets <= tickets) {
          System.out.println("You booked ticket " + wanttickets);
          tickets -= wanttickets;
      } 
	  else if (wanttickets == 2 && tickets == 1) {
          System.out.println("Sorry, only 1 ticket available");
      }
	  else {
          System.out.println( "No tickets available");
      }
  }
}
 

class Thread1 extends Thread {
    Ticket_example t;

    Thread1(Ticket_example t) {
        this.t = t;
    }

    public void run() {
        t.booktickets(1);
    }
}

class Thread2 extends Thread {
    Ticket_example t;

    Thread2(Ticket_example t) {
        this.t = t;
    }

    public void run() {
        t.booktickets(2);
    }
}
























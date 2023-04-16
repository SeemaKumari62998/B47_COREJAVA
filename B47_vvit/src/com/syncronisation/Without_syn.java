package com.syncronisation;
//program without synchronization
public  class Without_syn implements Runnable {
	int tickets=3;
	int i=1;
    void bookticket(String name,int wantedtickets) {
	if(wantedtickets <=tickets) {
		System.out.println(wantedtickets + " "+ "bookedto" + name);
		tickets=tickets-wantedtickets;
		
		
	}
	else {
		System.out.println("no tickets booked");
	}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		System.out.println("Current thresd is:"+name);
		if(name.equals("First thread")) {
			bookticket(name,i);
			
		}
		else if(name.equals("second thread")) {
			bookticket(name,i);
		}
		else {
			bookticket(name,i);
		}
				
	}
	

}

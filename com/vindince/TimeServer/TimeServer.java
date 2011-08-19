package com.vindince.TimeServer;

public class TimeServer {
	
	
	public static TimeReceiver time = new TimeReceiver();
	public static SecondaryTimeReceiver newTime = new SecondaryTimeReceiver();
	
	
	public static void main(String args[]){
		
		
		time.setDay(22);
		time.setHour(12);
		time.setMonth(2);
		
		time.tellTime();
		
		newTime.setDay(5);
		
		newTime.tellTime();
		
		
		
		
		
	}

}

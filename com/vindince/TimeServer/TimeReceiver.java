package com.vindince.TimeServer;

public class TimeReceiver implements TimeServerInterface{

	
	int day,hour,month;
	
	
	
	
	
	public void tellTime(){
		
		System.out.println("Day: "  + day + " Hour: " + hour + " Month: " + month );
		
	}
	
	@Override
	public void setDay(int day) {
		
		this.day = day;
	}

	@Override
	public void setHour(int hour) {
		this.hour = hour;
		
	}

	@Override
	public void setMonth(int month) {
		this.month = month;
		
	}

}

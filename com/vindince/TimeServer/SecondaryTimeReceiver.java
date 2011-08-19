package com.vindince.TimeServer;

public class SecondaryTimeReceiver implements TimeServerInterface {

	int day,hour,month;
	
	
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

	@Override
	public void tellTime() {
		
		System.out.println("Day is : " + day );
		
		
	}

}

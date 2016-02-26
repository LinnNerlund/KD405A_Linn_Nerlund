

public class ClockLogic implements ClockInterface {

	private digitalClockGUI clockGUI;
	private int alarmHour;
	private int alarmMinute;
//**	private DigitalClockGUI digClockGUI;**//
	
	public ClockLogic(digitalClockGUI clockIn){
		this.clockGUI = clockIn;
		Thread t = new ClockThread(this);
		t.start();
	}
	
	public void setAlarm(int hours, int minute){
		this.alarmHour = hours;
		this.alarmMinute = minute;
	}
	
	public void clearAlarm(){
		//setAlarm(-1, -1);
		//digitalClockGUI.activeAlarm(false);
		clockGUI.timeLabel.setText("No Alarm");
		clockGUI.alarmMessage.setText("");
		this.alarmHour =100;
		this.alarmMinute=100;
	}
	@Override
	public void update(int hours, int minutes, int seconds){
		String zero1 = "";
		String zero2 = "";
		String zero3 = "";
		
		if (hours < 10){
			zero1 = "0";
		}
		if (minutes < 10){
			zero2 = "0";
		
	}
		if (seconds < 10){
			zero3 = "0";
		}
		
		String hourString = zero1 + Integer.toString(hours);
		String minuteString = zero2 + Integer.toString(minutes);
		String secondString = zero3 + Integer.toString(seconds);
		String finalTimeString = hourString + ":" + minuteString + ":" + secondString;
		
		clockGUI.setTimeOnLabel(finalTimeString);
		
		zero1 = "";
		zero2 = "";
		zero3 = "";
		
		int finalHour = hours;
		int finalMinute = minutes;
		
		if (this.alarmHour == finalHour && this.alarmMinute == finalMinute){
			System.out.println("Ring ring");
			clockGUI.activeAlarm(true);
			
		}
		
		
		}
}
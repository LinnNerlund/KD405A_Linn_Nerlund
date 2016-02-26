

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
		
	}

}
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class digitalClockGUI extends JFrame {

	private ClockLogic clockLogic;
	private JPanel contentPane;
	private JTextField hourTextField;
	private JTextField minuteTextField;

	JButton clearButton = new JButton("Clear Alarm");
	JLabel hourLabel = new JLabel("Hour");
	JLabel minuteLabel = new JLabel("Minute");
	JLabel alarmLabel = new JLabel("00:00:00");
	JLabel timeLabel = new JLabel("");
	JLabel alarmMessage = new JLabel("");
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					digitalClockGUI frame = new digitalClockGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public digitalClockGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digital Clock!");
		lblNewLabel.setBounds(161, 0, 108, 42);
		panel.add(lblNewLabel);
		
		hourTextField = new JTextField();
		hourTextField.setBounds(71, 82, 98, 52);
		panel.add(hourTextField);
		hourTextField.setColumns(10);
		
		minuteTextField = new JTextField();
		minuteTextField.setBounds(181, 82, 98, 52);
		panel.add(minuteTextField);
		minuteTextField.setColumns(10);
		
		JButton setLabel = new JButton("Set Alarm");
		setLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hourString = hourTextField.getText(); 
				int hour = Integer.parseInt(hourString);
				String minuteString = minuteTextField.getText();
				int minute = Integer.parseInt(minuteString);
				clockLogic.setAlarm(hour, minute); 
				
				alarmLabel.setText(hourTextField.getText() + " : " + minuteTextField.getText());
			}
		});
		setLabel.setBounds(311, 75, 117, 29);
		panel.add(setLabel);
		
		//JButton clearButton = new JButton("Clear Alarm");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clockLogic.clearAlarm();
				alarmLabel.setText(" ");
			}
		});
		clearButton.setBounds(311, 105, 117, 29);
		panel.add(clearButton);
		
		//JLabel hourLabel = new JLabel("Hour");
		hourLabel.setBounds(86, 64, 61, 16);
		panel.add(hourLabel);
		
		//JLabel minuteLabel = new JLabel("Minute");
		minuteLabel.setBounds(196, 65, 61, 16);
		panel.add(minuteLabel);
		
		//JLabel alarmLabel = new JLabel("");
		alarmLabel.setBounds(311, 147, 107, 60);
		panel.add(alarmLabel);
		
		//JLabel timeLabel = new JLabel("");
		timeLabel.setBounds(57, 159, 200, 72);
		panel.add(timeLabel);
		
		//JLabel alarmMessage = new JLabel("");
		alarmMessage.setBounds(160, 246, 138, 16);
		panel.add(alarmMessage);
	}
	
	
	public void setTimeOnLabel(String time){
		timeLabel.setText(time);
	}
	
	public void setAlarmOnLabel(String alarmTime){
		alarmLabel.setText(alarmTime);
	}
	
	public void activeAlarm(boolean activate){
		if(activate)
		{
			alarmMessage.setText(" Vakna Slöfock! ");
		}else{
		 alarmMessage.setText(" ");
		}

		
		
	}    
	   
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class SkanetrafikenGUI extends JFrame {
	private JTextArea resultArea;
	private JTextArea textArea;
	
	
	
	private JPanel contentPane;
	private JTextField searchStationText;
	private JTextField toTextField;
	private JTextField fromTextField;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkanetrafikenGUI frame = new SkanetrafikenGUI();
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
	public SkanetrafikenGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 6, 147, 38);
		contentPane.add(panel);
		
		searchStationText = new JTextField();
		panel.add(searchStationText);
		searchStationText.setColumns(10);
		
		JButton searchStation = new JButton("Sök");
		searchStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultArea.setText("söker...");
				
				new GetStationThread().start();
			}
		});
		searchStation.setBounds(15, 56, 117, 29);
		contentPane.add(searchStation);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 115, 125, 142);
		contentPane.add(scrollPane);
		
		resultArea = new JTextArea();
		scrollPane.setViewportView(resultArea);
		
		panel_1 = new JPanel();
		panel_1.setBounds(237, 6, 185, 85);
		contentPane.add(panel_1);
		
		fromTextField = new JTextField();
		panel_1.add(fromTextField);
		fromTextField.setColumns(10);
		
		toTextField = new JTextField();
		panel_1.add(toTextField);
		toTextField.setColumns(10);
		
		JButton searchTripButton = new JButton("Sök");
		searchTripButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("searching...");
				
				new GetJourneysThread().start();
			}
		});
		
		searchTripButton.setBounds(269, 93, 117, 29);
		contentPane.add(searchTripButton);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(225, 115, 198, 142);
		contentPane.add(scrollPane_1);
		
		textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
	}
	
		private class GetStationThread extends Thread{
		@Override
		public void run(){
	
	
		ArrayList<Station>searchStations = new ArrayList<Station>();
	searchStations.addAll(Parser.getStationsFromURL(searchStationText.getText()));
	resultArea.setText("");
	for (Station s: searchStations){
		
		resultArea.append(s.getStationName() + "number: " + s.getStationNbr() + "\n");
		
	}
	}
}
	private class GetJourneysThread extends Thread{
		@Override
		public void run(){
			
			String searchURL = Constants.getURL(fromTextField.getText(), toTextField.getText(), 1);
			
			Journeys journeys = Parser.getJourneys(searchURL);
			for (Journey journey : journeys.getJourneys()){
				textArea.setText("");
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":" + journey.getDepDateTime().get(Calendar.MINUTE);
			
			    textArea.setText(journey.getStartStation() + " - " + journey.getEndStation() + " deoarts" + time + " that is in " + journey.getTimeToDeparture() + " minutes. And it is " + journey.getDepTimeDeviation()+ " min late." + "\n");
			}
		}
	}
}

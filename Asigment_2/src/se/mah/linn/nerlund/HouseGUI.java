package se.mah.linn.nerlund;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import java.awt.TextArea;
import java.awt.Scrollbar;
import javax.swing.JTextArea;

public class HouseGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	House house1;
	House house2;
	House house3;
	house1 = new House(1998, 800);
	house2 = new House(2004, 500);
	house3 = new House(1900, 400);
	
	
	int houseSize = house1.getSize();
	int houseYear = house1.getYearBuilt();
	int houseSize2 = house2.getSize();
	int houseYear2 = house2.getYearBuilt();
	int houseSize3 = house3.getSize();
	int houseYear3 = house3.getYearBuilt();
	
	System.out.println("Storleken på hus 1 år " + houseSize);
	System.out.println("Hus 1 år byggt år " + houseYear);

	System.out.println("Storleken på hus 2 år " + houseSize2);
	System.out.println("Hus 2 år byggt år " + houseYear2);

	System.out.println("Storleken på hus 2 år " + houseSize3);
	System.out.println("Hus 3 år byggt år " + houseYear3);
	
	textArea.append("Uppgift 1.2" + "\n");
	textArea.append("Hus 1 år byggt år " + houseYear + " och år " + houseSize + " kvm stort" + "\n");
	textArea.append("Hus 2 år byggt år " + houseYear2 + " och år " + houseSize2 + " kvm stort" + "\n");
	textArea.append("Hus 3 år byggt år " + houseYear3 + " och år " + houseSize3 + " kvm stort" + "\n");

	/**
	 * Create the frame.
	 */
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(58, 22, 423, 246);
		contentPane.add(scrollbar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(58, 95, 227, 137);
		contentPane.add(textArea);
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BikeStoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldColor;
	private JTextField textFieldSize;
	private JTextField textFieldPrice;
	
	BikeStore bikeStore = new BikeStore();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI frame = new BikeStoreGUI();
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
	public BikeStoreGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(5, 5, 239, 239);
		contentPane.add(textArea);
		
		textFieldColor = new JTextField();
		textFieldColor.setBounds(256, 5, 189, 29);
		contentPane.add(textFieldColor);
		textFieldColor.setColumns(10);
		
		JButton btnNewBike = new JButton("New bike");
		btnNewBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int size;
				int price;
				size = Integer.parseInt(textFieldSize.getText());
				price = Integer.parseInt(textFieldPrice.getText());
				bikeStore.addBike(textFieldColor.getText(), size, price);
				textArea.setText(bikeStore.getAllBikes());
				
			}
		});
		btnNewBike.setBounds(5, 244, 440, 29);
		contentPane.add(btnNewBike);
		
		textFieldSize = new JTextField();
		textFieldSize.setColumns(10);
		textFieldSize.setBounds(256, 61, 189, 29);
		contentPane.add(textFieldSize);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(256, 124, 189, 29);
		contentPane.add(textFieldPrice);
	}

}

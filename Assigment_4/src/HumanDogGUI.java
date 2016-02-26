import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HumanDogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField humanField;
	private JTextField dogField;
	static Human human;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumanDogGUI frame = new HumanDogGUI();
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
	public HumanDogGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea errorField = new JTextArea();
		errorField.setBounds(73, 221, 179, 34);
		contentPane.add(errorField);
		
		JTextArea infoField = new JTextArea();
		infoField.setBounds(73, 173, 179, 34);
		contentPane.add(infoField);
		
		JLabel lblHumansAndDogs = new JLabel("Humans and Dogs");
		lblHumansAndDogs.setBounds(93, 22, 159, 16);
		contentPane.add(lblHumansAndDogs);
		
		humanField = new JTextField();
		humanField.setBounds(6, 50, 130, 26);
		contentPane.add(humanField);
		humanField.setColumns(10);
		
		dogField = new JTextField();
		dogField.setBounds(6, 98, 130, 26);
		contentPane.add(dogField);
		dogField.setColumns(10);
		
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (humanField.getText().length() >= 3){
					errorField.setText("");
					human = new Human (humanField.getText());
				}else{
				errorField.setText("give the human a longer name");
				}
				}
		});
		btnNewHuman.setBounds(157, 50, 117, 29);
		contentPane.add(btnNewHuman);
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (dogField.getText().length() > 0){
					errorField.setText("");
					if(human == null){
						errorField.setText("Dog needs owner");
					}else{
						errorField.setText("");
						human.buyDog(new Dog (dogField.getText()));
					}
				}else{
					errorField.setText("write name for dog");
				}
				
			}
		});
		btnBuyDog.setBounds(157, 91, 117, 29);
		contentPane.add(btnBuyDog);
		
		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(human != null){
					errorField.setText("");
					infoField.setText(human.getInfo());
				}else{
					errorField.setText("no info to print");
				}
			}
		});
		btnPrintInfo.setBounds(157, 132, 117, 29);
		contentPane.add(btnPrintInfo);
	}
}

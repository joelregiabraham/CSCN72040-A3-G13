import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MainWindow extends JFrame  {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton acOnBttn = new JButton("Air Conditioner ON");
		acOnBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		acOnBttn.setBounds(22, 22, 179, 39);
		contentPane.add(acOnBttn);
		
		JButton acOffBttn = new JButton("Air Conditioner OFF");
		acOffBttn.setBounds(236, 22, 179, 39);
		contentPane.add(acOffBttn);
		
		JButton garageOpnBttn = new JButton("Garage Door OPEN");
		garageOpnBttn.setBounds(22, 78, 179, 39);
		contentPane.add(garageOpnBttn);
		
		JButton garageClsBttn = new JButton("Garage Door CLOSE");
		garageClsBttn.setBounds(236, 72, 179, 39);
		contentPane.add(garageClsBttn);
		
		JButton lRoomOnBttn = new JButton("Living Room Light ON");
		lRoomOnBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		lRoomOnBttn.setBounds(22, 128, 179, 39);
		contentPane.add(lRoomOnBttn);
		
		JButton lRoomOffBttn = new JButton("Living Room Light OFF");
		lRoomOffBttn.setBounds(236, 122, 179, 39);
		contentPane.add(lRoomOffBttn);
		
		JButton odLightOnBttn = new JButton("Outdoor Light ON");
		odLightOnBttn.setBounds(22, 178, 179, 39);
		contentPane.add(odLightOnBttn);
		
		JButton odLightOffBttn = new JButton("Outdoor Light OFF");
		odLightOffBttn.setBounds(236, 172, 179, 39);
		contentPane.add(odLightOffBttn);
		
		JButton unusedSltBttn = new JButton("Unused Slot");
		unusedSltBttn.setBounds(142, 274, 179, 39);
		contentPane.add(unusedSltBttn);
		
		JButton undoBttn = new JButton("Undo");
		undoBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		undoBttn.setBounds(22, 324, 179, 39);
		contentPane.add(undoBttn);
		
		JButton resetBttn = new JButton("Reset");
		resetBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		resetBttn.setBounds(236, 324, 179, 39);
		contentPane.add(resetBttn);
		
		textField = new JTextField();
		textField.setBounds(22, 228, 393, 35);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}

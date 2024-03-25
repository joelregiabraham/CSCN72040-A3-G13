import java.awt.EventQueue; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MainWindow extends JFrame  {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;

    private RemoteControl remoteControl;

    public MainWindow(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
        initComponents();
    }

    private void initComponents() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 454, 491);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton acOnBttn = new JButton("Air Conditioner ON");
        acOnBttn.setBounds(22, 78, 179, 39);
        contentPane.add(acOnBttn);
        
        JButton acOffBttn = new JButton("Air Conditioner OFF");
        acOffBttn.setBounds(236, 78, 179, 39);
        contentPane.add(acOffBttn);
        
        JButton garageOpnBttn = new JButton("Garage Door OPEN");
        garageOpnBttn.setBounds(22, 128, 179, 39);
        contentPane.add(garageOpnBttn);
        
        JButton garageClsBttn = new JButton("Garage Door CLOSE");
        garageClsBttn.setBounds(236, 128, 179, 39);
        contentPane.add(garageClsBttn);
        
        JButton lRoomOnBttn = new JButton("Living Room Light ON");
        lRoomOnBttn.setBounds(22, 178, 179, 39);
        contentPane.add(lRoomOnBttn);
        
        JButton lRoomOffBttn = new JButton("Living Room Light OFF");
        lRoomOffBttn.setBounds(236, 178, 179, 39);
        contentPane.add(lRoomOffBttn);
        
        JButton odLightOnBttn = new JButton("Outdoor Light ON");
        odLightOnBttn.setBounds(22, 228, 179, 39);
        contentPane.add(odLightOnBttn);
        
        JButton odLightOffBttn = new JButton("Outdoor Light OFF");
        odLightOffBttn.setBounds(236, 228, 179, 39);
        contentPane.add(odLightOffBttn);
        
        JButton unusedSltBttn = new JButton("Unused Slot");
        unusedSltBttn.setBounds(140, 338, 179, 39);
        contentPane.add(unusedSltBttn);
        
        JButton undoBttn = new JButton("Undo");
        undoBttn.setBounds(22, 402, 179, 39);
        contentPane.add(undoBttn);
        
        JButton resetBttn = new JButton("Reset");
        resetBttn.setBounds(236, 402, 179, 39);
        contentPane.add(resetBttn);
        
        JButton allLightsOnBttn = new JButton("All Lights ON");
        allLightsOnBttn.setBounds(22, 278, 179, 39);
        contentPane.add(allLightsOnBttn);
        
        JButton allLightsOffBttn = new JButton("All Lights OFF");
        allLightsOffBttn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        allLightsOffBttn.setBounds(236, 278, 179, 39);
        contentPane.add(allLightsOffBttn);
        
        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setBounds(22, 11, 393, 35);
        contentPane.add(textField);
        textField.setColumns(10);

        // Add action listeners to buttons.
        // Text fields have been updated to reflect changes from command interface.
        acOnBttn.addActionListener(e -> {
        	remoteControl.pressButton("Air-Conditioner Slot ON");
        	textField.setText(e.getActionCommand());
        });
        acOffBttn.addActionListener(e -> {
        	remoteControl.pressButton("Air-Conditioner Slot OFF");
        	textField.setText(e.getActionCommand());
        });
        garageOpnBttn.addActionListener(e ->{
        	remoteControl.pressButton("Garage Door Slot OPEN");
        	textField.setText(e.getActionCommand());
        });
        garageClsBttn.addActionListener(e -> {
        	remoteControl.pressButton("Garage Door Slot CLOSE");
        	textField.setText(e.getActionCommand());
        });
        lRoomOnBttn.addActionListener(e -> {
        	remoteControl.pressButton("Living Room Light Slot ON");
        	textField.setText(e.getActionCommand());
        });
        lRoomOffBttn.addActionListener(e -> {
        	remoteControl.pressButton("Living Room Light Slot OFF");
        	textField.setText(e.getActionCommand());
        });
        odLightOnBttn.addActionListener(e -> {
        	remoteControl.pressButton("Outdoor Light Slot ON");
        	textField.setText(e.getActionCommand());
        });
        odLightOffBttn.addActionListener(e -> {
        	remoteControl.pressButton("Outdoor Light Slot OFF");
        	textField.setText(e.getActionCommand());
        });
        allLightsOnBttn.addActionListener(e -> {
        	remoteControl.pressButton("All Lights Slot ON");
        	textField.setText(e.getActionCommand());
        });
        allLightsOffBttn.addActionListener(e-> {
        	remoteControl.pressButton("All Lights Slot OFF");
        	textField.setText(e.getActionCommand());
        });
        unusedSltBttn.addActionListener(e->
        {
        	// Modify as needed.
        	textField.setText("This slot has no functionality.");
        });
      

        // Add action listeners to undo and reset buttons
        undoBttn.addActionListener(e -> {
        	remoteControl.undoButton();
        	textField.setText("Undo button pressed.");
        });
        resetBttn.addActionListener(e -> {
            remoteControl.resetAllButtons();
            textField.setText("All buttons have been reset.");
            
        });
    }
}

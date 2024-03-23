import java.awt.EventQueue;

public class Client {

public static void main(String[] args) {
	
	// Create RemoteControl instance
    RemoteControl remoteControl = new RemoteControl();
	 
	// Create Receivers
     AirConditioner  airConditioner = new AirConditioner();
     GarageDoor garageDoor = new GarageDoor();
     LivingRoomLight livingRoomLight = new LivingRoomLight();
     OutdoorLight outdoorLight = new OutdoorLight();
     AllLight allLight = new AllLight();
     
     // Create on commands
     Command airConditionerOnCommand = new AirConditionerTurnONCommand(airConditioner);
     Command garageDoorOpenCommand = new GarageDoorTurnONCommand(garageDoor);
     Command livingRoomLightOnCommand = new LivingRoomLightTurnONCommand(livingRoomLight);
     Command outdoorLightOnCommand = new OutdoorLightTurnONCommand(outdoorLight);
     Command allLightOnCommand = new AllLightTurnONCommand(livingRoomLight, outdoorLight);

     // Create off commands
     Command airConditionerOffCommand = new AirConditionerTurnOFFCommand(airConditioner);
     Command garageDoorCloseCommand = new GarageDoorTurnOFFCommand(garageDoor);
     Command livingRoomLightOffCommand = new LivingRoomLightTurnOFFCommand(livingRoomLight);
     Command outdoorLightOffCommand = new OutdoorLightTurnOFFCommand(outdoorLight);
     Command allLightOffCommand = new AllLightTurnOFFCommand(livingRoomLight, outdoorLight);

     // Create remote control
     //RemoteControl remoteControl = new RemoteControl();

     // Program slots
  // Program slots
     remoteControl.setCommand("Air-Conditioner Slot ON", airConditionerOnCommand);
     remoteControl.setCommand("Garage Door Slot OPEN", garageDoorOpenCommand);
     remoteControl.setCommand("Living Room Light Slot ON", livingRoomLightOnCommand);
     remoteControl.setCommand("Outdoor Light Slot ON", outdoorLightOnCommand);
     remoteControl.setCommand("All Lights Slot ON", allLightOnCommand);
     
     remoteControl.setCommand("Air-Conditioner Slot OFF", airConditionerOffCommand);
     remoteControl.setCommand("Garage Door Slot CLOSE", garageDoorCloseCommand);
     remoteControl.setCommand("Living Room Light Slot OFF", livingRoomLightOffCommand);
     remoteControl.setCommand("Outdoor Light Slot OFF", outdoorLightOffCommand);
     remoteControl.setCommand("All Lights Slot OFF", allLightOffCommand);


     // Press buttons
		/*
		 * remoteControl.pressButton("Air-Conditioner Slot ON");
		 * remoteControl.pressButton("Garage Door Slot OPEN");
		 * remoteControl.pressButton("Living Room Light Slot ON");
		 * remoteControl.pressButton("Outdoor Light Slot ON");
		 * remoteControl.pressButton("Air-Conditioner Slot OFF");
		 * remoteControl.pressButton("Garage Door Slot CLOSE");
		 * remoteControl.pressButton("Living Room Light Slot OFF");
		 * remoteControl.pressButton("Outdoor Light Slot OFF");
		 */

     // Reset all buttons
     //remoteControl.resetAllButtons();
  // Create and display the GUI
     EventQueue.invokeLater(() -> {
         try {
             MainWindow frame = new MainWindow(remoteControl);
             frame.setVisible(true);
         } catch (Exception e) {
             e.printStackTrace();
         }
     });
 }
}



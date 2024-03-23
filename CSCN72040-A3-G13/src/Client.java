
public class Client {

public static void main(String[] args) {
  
		// Receivers
     AirConditioner  airConditioner = new AirConditioner();
     GarageDoor garageDoor = new GarageDoor();
     LivingRoomLight livingRoomLight = new LivingRoomLight();
     OutdoorLight outdoorLight = new OutdoorLight();
     
  // Create commands
     Command airConditionerCommand = new AirConditionerTurnONCommand(airConditioner);
     Command airConditionerCommand = new AirConditionerTurnOFFCommand(airConditioner);
     Command garageDoorCommand = new GarageDoorCommand(garageDoor);
     Command livingRoomLightCommand = new LivingRoomLightCommand(livingRoomLight);
     Command outdoorLightCommand = new OutdoorLightCommand(outdoorLight);

     // Create remote control
     RemoteControl remoteControl = new RemoteControl();

     // Program slots
     remoteControl.setCommand("Air-Conditioner Slot", airConditionerCommand);
     remoteControl.setCommand("Garage Door Slot", garageDoorCommand);
     remoteControl.setCommand("Living Room Light Slot", livingRoomLightCommand);
     remoteControl.setCommand("Outdoor Light Slot", outdoorLightCommand);

     // Press buttons
     remoteControl.pressButton("Air-Conditioner Slot");
     remoteControl.pressButton("Air-Conditioner Slot");
     remoteControl.pressButton("Garage Door Slot");
     remoteControl.pressButton("Living Room Light Slot");
     remoteControl.pressButton("Outdoor Light Slot");

     // Reset all buttons
     remoteControl.resetAllButtons();
 }
}

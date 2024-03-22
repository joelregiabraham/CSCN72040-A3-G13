
// GarageDoorCommand.java
public class GarageDoorCommand implements Command{
	private GarageDoor garageDoor;
	
	public GarageDoorCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.turnOn();
	}
}

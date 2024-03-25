
// GarageDoorCommand.java
public class GarageDoorTurnONCommand implements Command{
	private GarageDoor garageDoor;
	
	public GarageDoorTurnONCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() 
	{
		garageDoor.turnOn();
	}
	
	@Override
	public void undo()
	{
		garageDoor.turnOff();
	}
}

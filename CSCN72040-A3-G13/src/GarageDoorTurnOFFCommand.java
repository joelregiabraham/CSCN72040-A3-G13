
// GarageDoorCommand.java
public class GarageDoorTurnOFFCommand implements Command{
	private GarageDoor garageDoor;
	
	public GarageDoorTurnOFFCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute()
	{
		garageDoor.turnOff();
	}
	
	@Override
	public void undo()
	{
		garageDoor.turnOn();
	}
}

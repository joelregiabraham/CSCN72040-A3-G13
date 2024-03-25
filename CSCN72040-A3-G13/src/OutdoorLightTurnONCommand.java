
public class OutdoorLightTurnONCommand implements Command{
	private OutdoorLight outdoorLight;
	
	public OutdoorLightTurnONCommand(OutdoorLight outdoorLight) {
		this.outdoorLight = outdoorLight;
	}
	
	@Override
	public void execute() {
		outdoorLight.turnOn();
	}
	
	@Override
	public void undo() {
		outdoorLight.turnOff();
	}
}


public class OutdoorLightCommand implements Command{
	private OutdoorLight outdoorLight;
	
	public OutdoorLightCommand(OutdoorLight outdoorLight) {
		this.outdoorLight = outdoorLight;
	}
	
	@Override
	public void execute() {
		outdoorLight.turnOn();
	}
}

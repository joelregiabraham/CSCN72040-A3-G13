
public class OutdoorLightTurnOFFCommand implements Command{
	private OutdoorLight outdoorLight;
	
	public OutdoorLightTurnOFFCommand(OutdoorLight outdoorLight) {
		this.outdoorLight = outdoorLight;
	}
	
	@Override
	public void execute() {
		outdoorLight.turnOff();
	}
}

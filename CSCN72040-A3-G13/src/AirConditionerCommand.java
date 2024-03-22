// AirConditionerCommand.java

public class AirConditionerCommand implements Command {

	private AirConditioner AC;
	
	public AirConditionerCommand(AirConditioner AC) {
		this.AC = AC;
	}
	
	@Override
	public void execute() {
		AC.turnOn();
	}
}


// AirConditionerCommand.java

public class AirConditionerTurnONCommand implements Command {

	private AirConditioner airConditioner;
	
	public AirConditionerTurnONCommand(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}
	
	@Override
	public void execute() {
		airConditioner.turnOn();
		
	}
	
	@Override
	public void undo()
	{
		airConditioner.turnOff();
	}

}


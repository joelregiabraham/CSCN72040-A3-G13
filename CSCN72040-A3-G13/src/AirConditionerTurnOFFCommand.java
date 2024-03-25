// AirConditionerCommand.java

public class AirConditionerTurnOFFCommand implements Command {

	private AirConditioner airConditioner;
	
	public AirConditionerTurnOFFCommand(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}
	
	@Override
	public void execute() {
		airConditioner.turnOff();	
	}
	
	@Override
	public void undo()
	{
		airConditioner.turnOn();
	}

}


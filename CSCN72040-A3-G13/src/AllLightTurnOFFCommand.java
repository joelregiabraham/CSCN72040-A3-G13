
// Turn OFF All Lights
public class AllLightTurnOFFCommand implements Command {
	
    private LivingRoomLight livingRoomLight;
    private OutdoorLight outdoorLight;
    
    public AllLightTurnOFFCommand(LivingRoomLight livingRoomLight, OutdoorLight outdoorLight) {
    	this.livingRoomLight = livingRoomLight;
    	this.outdoorLight = outdoorLight;
    }
    
    
    @Override
    public void execute() {
    	livingRoomLight.turnOff();
    	outdoorLight.turnOff();
    }
    
    @Override
	public void undo()
	{
		livingRoomLight.turnOn();
		livingRoomLight.turnOn();
	}
}

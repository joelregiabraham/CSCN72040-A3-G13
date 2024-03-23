
// Turn ON All Lights
public class AllLightTurnONCommand implements Command {
	
    private LivingRoomLight livingRoomLight;
    private OutdoorLight outdoorLight;
    
    public AllLightTurnONCommand(LivingRoomLight livingRoomLight, OutdoorLight outdoorLight) {
    	this.livingRoomLight = livingRoomLight;
    	this.outdoorLight = outdoorLight;
    }
    
    
    @Override
    public void execute() {
    	livingRoomLight.turnOn();
    	outdoorLight.turnOn();
    }
}

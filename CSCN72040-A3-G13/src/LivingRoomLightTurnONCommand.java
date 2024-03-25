
public class LivingRoomLightTurnONCommand implements Command{
	
	private LivingRoomLight livingRoomLight;
	
	public LivingRoomLightTurnONCommand(LivingRoomLight livingRoomLight) {
		this.livingRoomLight = livingRoomLight;
	}
	
	@Override
	public void execute() {
		livingRoomLight.turnOn();
	}
	
	@Override
	public void undo(){
		livingRoomLight.turnOff();
	}
}

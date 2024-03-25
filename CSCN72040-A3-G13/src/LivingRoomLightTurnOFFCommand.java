
public class LivingRoomLightTurnOFFCommand implements Command{
	
	private LivingRoomLight livingRoomLight;
	
	public LivingRoomLightTurnOFFCommand(LivingRoomLight livingRoomLight) {
		this.livingRoomLight = livingRoomLight;
	}
	
	@Override
	public void execute() {
		livingRoomLight.turnOff();
	}
	
	@Override
	public void undo() {
		livingRoomLight.turnOn();
	}
}

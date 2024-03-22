
public class LivingRoomLightCommand implements Command{
	
	private LivingRoomLight livingRoomLight;
	
	public LivingRoomLightCommand(LivingRoomLight livingRoomLight) {
		this.livingRoomLight = livingRoomLight;
	}
	
	@Override
	public void execute() {
		livingRoomLight.turnOn();
	}
}

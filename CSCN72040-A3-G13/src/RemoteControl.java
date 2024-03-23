
// RemoteControl.java
import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private Map<String, Command> commands;

    public RemoteControl() {
        commands = new HashMap<>();
    }

    public void setCommand(String slot, Command command) {
        commands.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = commands.get(slot);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Slot " + slot + " is not programmed.");
        }
    }

    public void resetAllButtons() {
        commands.clear();
        System.out.println("All buttons have been reset.");
    }
}


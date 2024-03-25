
// RemoteControl.java
import java.util.HashMap;
import java.util.Stack;
import java.util.Map;


public class RemoteControl {
    private Map<String, Command> commands;
    private Stack<Command> executedCommands;
    

    public RemoteControl() {
        commands = new HashMap<>();
        executedCommands = new Stack<>();
    }

    public void setCommand(String slot, Command command) {
        commands.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = commands.get(slot);
        if (command != null) {
            command.execute();
            executedCommands.push(command);
        } else {
            System.out.println("Slot " + slot + " is not programmed.");
        }
    }
    

    public void undoButton(String slot) {
            if (!executedCommands.isEmpty()) {
                Command lastCommand = executedCommands.pop();
                lastCommand.undo();
            } else {
                System.out.println("No command to undo.");
            }
        }

    public void resetAllButtons() {
        commands.clear();
        System.out.println("All buttons have been reset.");
    }
    
    public void undoButton()
    {
    	System.out.println("Slots remapped.");
    }
}


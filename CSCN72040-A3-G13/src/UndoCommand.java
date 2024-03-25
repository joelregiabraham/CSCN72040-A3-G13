
public class UndoCommand implements Command{
	
	private UndoCommand undoCommand;
	
	public UndoCommand(UndoCommand undoCommand)
	{
		this.undoCommand = undoCommand;
	}
	
	@Override
	public void execute()
	{
		
	}
	
	@Override
	public void undo()
	{
		
	}
	
}

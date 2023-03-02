package CommandPattern;

class UniversalRemote{
	CommandClass c[]=new CommandClass[5];
	public void executeCommand(int slot) {
		c[slot].execute();
	}
	
	public void assignCommand(int slot,CommandClass command) {
		c[slot]=command;
	}
}

package CommandPattern;

class UniversalRemote{
	CommandClass c[]=new CommandClass[5];
	public UniversalRemote() {
		for(int i=0;i<5;i++) {
			c[i]=new DummyCommand();
		}
	}
	
	public void executeCommand(int slot) {
		c[slot].execute();
	}
	
	public void assignCommand(int slot,CommandClass command) {
		c[slot]=command;
	}
}

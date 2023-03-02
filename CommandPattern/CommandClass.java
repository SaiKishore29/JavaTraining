package CommandPattern;

abstract class CommandClass{
	Tv tv;SetTopBox sbox;SoundSystem ss;VGame vgame;
	public CommandClass() {
		// TODO Auto-generated constructor stub
	}
	
	public CommandClass(Tv tv, SetTopBox sbox, SoundSystem ss, VGame vgame) {
		this.tv = tv;
		this.sbox = sbox;
		this.ss = ss;
		this.vgame = vgame;
	}
	public abstract void execute();
}

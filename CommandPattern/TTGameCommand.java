package CommandPattern;

class TTGameCommand extends CommandClass{
	public TTGameCommand(Tv tv, SetTopBox sbox, SoundSystem ss, VGame vgame) {
		super(tv,sbox,ss,vgame);
	}
	@Override
	public void execute() {
		System.out.println("the ttgame process started...");
		tv.av2();
		vgame.ttgame();
		ss.decreaseVolume();		
		System.out.println("enjoy the tt game....");
	}
}

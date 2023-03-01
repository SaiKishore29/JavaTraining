package CommandPattern;

class NewsChannelCommand extends CommandClass{
	public NewsChannelCommand(Tv tv, SetTopBox sbox, SoundSystem ss, VGame vgame) {
		super(tv,sbox,ss,vgame);
	}
	@Override
	public void execute() {
		System.out.println("the news channel process started...");
		tv.av1();
		sbox.newChannel();
		ss.increaseVolume();		
		System.out.println("enjoy the news channel....");
	}
}

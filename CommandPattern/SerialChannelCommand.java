package CommandPattern;

class SerialChannelCommand extends CommandClass{
	public SerialChannelCommand(Tv tv, SetTopBox sbox, SoundSystem ss, VGame vgame) {
		super(tv,sbox,ss,vgame);
	}
	@Override
	public void execute() {
		System.out.println("the serial channel process started...");
		tv.av1();
		sbox.serialChannel();
		ss.increaseVolume();		
		System.out.println("enjoy serial channel....");
	}
}

package CommandPattern;

import java.util.Scanner;

public class Command {
	public static void main(String[] args) {
		UniversalRemote universalRemote=new UniversalRemote();
		
		Tv tv=new Tv();
		SetTopBox sbox=new SetTopBox();
		SoundSystem ss=new SoundSystem();
		VGame vgame=new VGame();
		Scanner scan=new Scanner(System.in);
		CommandClass newscommand=new NewsChannelCommand(tv, sbox, ss, vgame);
		CommandClass serialcommand=new SerialChannelCommand(tv, sbox, ss, vgame);
		CommandClass ttgamecommand=new TTGameCommand(tv, sbox, ss, vgame);
		
		universalRemote.assignCommand(0, ttgamecommand);
		universalRemote.assignCommand(1, newscommand);
		universalRemote.assignCommand(2, serialcommand);
		System.out.println("Enter 1 for ttgame");
		System.out.println("Enter 2 for News Channel");
		System.out.println("Enter 3 for Serial Channel");
		System.out.println("Enter the command:");
		int c=scan.nextInt();
		universalRemote.executeCommand(c);
		scan.close();
	}
}
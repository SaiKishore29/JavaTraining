package VisitorPattern;

class Police extends PoliceStation{

	@Override
	public void investigate(TheftException theftException) {
		System.out.println("Find the Theif");
		
	}

	@Override
	public void investigate(KidnapException kidnapException) {
		System.out.println("Find the Kidnaper");
		
	}

	@Override
	public void investigate(MuderException muderException) {
		System.out.println("Find the Muderer");		
	}
	
}

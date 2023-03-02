package VisitorPattern;

abstract class PoliceStation{
	abstract public void investigate(TheftException theftException);
	abstract public void investigate(KidnapException kidnapException);
	abstract public void investigate(MuderException muderException);
}
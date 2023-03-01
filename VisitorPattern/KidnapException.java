package VisitorPattern;

class KidnapException extends CityException{
	String CaseInfo;
	public KidnapException(String CaseInfo) {
		this.CaseInfo=CaseInfo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return CaseInfo;
	}
	@Override
	public void callPoliceStation() {
		PoliceStation policeStation =new Police();
		policeStation.investigate(this);		
	}
	
}

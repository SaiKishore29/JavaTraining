package VisitorPattern;

class City{
	public void Cases(String Case) throws CityException{
		if(Case.equals("Valuable things are missing"))
			throw new TheftException("Theft");
		else if(Case.equals("Someone is missing"))
			throw new KidnapException("Kidnap");
		else if(Case.equals("Found deadbody"))
			throw new MuderException("Muder");
	}
}

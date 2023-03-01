package VisitorPattern;

class People{
	public void fileCase(City city,String Case) {
		try {
			city.Cases(Case);
		}catch(CityException e) {
			e.printStackTrace();
			e.callPoliceStation();
		}
	}
	
}

package day2;

public class Exno12 {

	public static void main(String[] args) {
		Wipro[] wipro=new Wipro[3];
		wipro[0]=new WiproTechnologies();
		wipro[1]=new WiproInfoTech();
		wipro[2]=new WiproBPO();
		for(int i=0;i<3;i++)
			System.out.println(wipro[i].companyName());
		
		

	}

}
abstract class Wipro{
	abstract String companyName();
}
class WiproTechnologies extends Wipro{

	@Override
	String companyName() {
		return "Wipro Technologies";
		
	}
	
}
class WiproInfoTech extends Wipro{

	@Override
	String companyName() {
		return "Wipro InfoTech";
		
	}
	
}
class WiproBPO extends Wipro{

	@Override
	String companyName() {
		return "Wipro BPO";
		
	}
	
}
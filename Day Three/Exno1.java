package day3;

public class Exno1 {

	public static void main(String[] args) {
		SalesPerson sp=new SalesPerson();
		SalesManager sm=new SalesManager();
		SalesTerritoryManager stm=new SalesTerritoryManager();
		Worker w=new Worker();
		sp.dept();
		sp.salesDeptRole();
		sm.dept();
		sm.salesDeptRole();
		stm.dept();
		stm.salesDeptRole();
		w.dept();
		w.prodDeptRole();
	}

}
interface Employee{
	void dept();
}
interface Sales extends Employee{
	void salesDeptRole();
}
interface Prod extends Employee{
	void prodDeptRole();
}
class SalesPerson implements Sales{

	@Override
	public void dept() {
		System.out.println("Sales Department");
		
	}

	@Override
	public void salesDeptRole() {
		System.out.println("Sales Person");		
	}
	
}
class SalesManager implements Sales{
	@Override
	public void dept() {
		System.out.println("Sales Department");
	}
	@Override
	public void salesDeptRole() {
		System.out.println("Sales Manager");
	}
}
class SalesTerritoryManager implements Sales{
	@Override
	public void dept() {
		System.out.println("Sales Department");
	}
	@Override
	public void salesDeptRole() {
		System.out.println("Sales Territory Manager");
	}
}
class Worker implements Prod{
	@Override
	public void dept() {
		System.out.println("Production Department");
	}
	@Override
	public void prodDeptRole() {
		System.out.println("Worker");
	}
}

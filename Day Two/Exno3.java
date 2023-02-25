package day2;

import java.util.Date;

public class Exno3 {

	public static void main(String[] args) {
		SalesPerson sp=new SalesPerson();
		System.out.println("Date of Joining of Sales Person:"+sp.doj);
		SalesManager sm=new SalesManager();
		System.out.println("Date of Joining of Sales Manager:"+sm.doj);
		SalesTerritoryManager stm=new SalesTerritoryManager();
		System.out.println("Date of Joining of sales Territory Manager:"+stm.doj);
		Worker w=new Worker();
		System.out.println("Date of Joining of Worker:"+w.doj);

	}

}
abstract class Employee{
	public Date doj;
}
class SalesPerson extends Employee{
	SalesPerson(){
		super.doj=new Date(115,5,15);
	}
}
class SalesManager extends SalesPerson{
	SalesManager(){
		super.doj=new Date(123,1,13);
	}
}
class SalesTerritoryManager extends SalesManager{
	SalesTerritoryManager(){
		super.doj=new Date(120,0,20);
	}
	
}
class Worker extends Employee{
	Worker(){
		super.doj=new Date(121,5,28);
	}
}

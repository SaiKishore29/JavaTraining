package FactoryPattern;

class ShoeFactory{
	String shoe;
	public ShoeFactory(String shoe) {
		this.shoe=shoe;
	}
	public Shoe makeShoe() {
		if(shoe.equals("Sports"))
			return new SportsShoe();
		else if(shoe.equals("Formal"))
			return new FormalShoe();
		else if(shoe.equals("Casual"))
			return new CasualShoe();
		else
			return null;
	}
}

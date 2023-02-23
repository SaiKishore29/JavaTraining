package Day1;
class Exno25 {
	//public static void main(String[] args) {
	public void useD(){
		Base b=new Base();
		System.out.println(b.method());
	}

}

protected class Base{
	String method() {
		return "Wow";
	}
}
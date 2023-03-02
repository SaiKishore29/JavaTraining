package SingletonPattern;

class SingletonClass{
	static private SingletonClass instance=null;
	static public SingletonClass getInstance() {
		if(instance==null)
			instance= new SingletonClass();
		return instance;
		
	}
	private SingletonClass() {
		// TODO Auto-generated constructor stub
	}
}

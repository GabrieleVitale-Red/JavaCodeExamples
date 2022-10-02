package NormalSingleton;

public class Singleton {
	
	
	private Singleton(){};
	
	private static final Singleton instance = new Singleton();
	
	//Eager implementation, when the class is created it gives a value to the instance.
	//Drawback created even if not used
	//Pro: easy
	public static Singleton getInstance() {
		return instance;
	}
	
	
	public void showMessage(){
		System.out.println("Hello mr worldss");
	}

}

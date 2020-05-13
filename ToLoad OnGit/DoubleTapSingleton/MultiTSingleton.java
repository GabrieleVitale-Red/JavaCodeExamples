package DoubleTapSingleton;

public class MultiTSingleton {

	
	private static volatile MultiTSingleton instance;
	
	private MultiTSingleton(){}
	
	public static MultiTSingleton getInstance(){
		if( instance == null){
			synchronized (MultiTSingleton.class) {
				if(instance == null) {
					instance = new MultiTSingleton();
				}
			}
		}
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello Mr. Wolrd");
	}
	
}

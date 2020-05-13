package LazySingleton;

public class SingletonLazy {
	
	private static SingletonLazy instance;
	
	private SingletonLazy(){}
	
	/*
	 * Lazy Singleton, avoids the instantiation of the instance variable
	 * drawBack: does not work well with multithread 
	 * pro: avoid useless instantiation of objects
	 */
	public static SingletonLazy getInstance() {
		if(instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}
	
	
	public void showMessage(){
		System.out.println("Hello mr worldss");
	}

}

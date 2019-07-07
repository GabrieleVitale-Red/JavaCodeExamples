
public class Client {

	public static void main(String[] args) {
		MineralFactory factory = new MineralFactory();
		Work work1 = factory.getObejctToBeWorked("QUARZO");
		work1.cut();
		System.out.println("Class of the object created by the factory: "+work1.getClass());
	}
}

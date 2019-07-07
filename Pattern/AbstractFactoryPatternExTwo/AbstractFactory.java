
public abstract class AbstractFactory {
	
	public abstract Tree createTree();
	
	public static AbstractFactory getFactory(String objectType) {
		switch (objectType.toLowerCase()) {
		case "willow":
			return new WillowFactory();
		case "cypress":
			return new CypressFactory();
		default:
			return null;
		}
	}
}

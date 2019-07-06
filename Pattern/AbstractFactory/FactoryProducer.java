
public class FactoryProducer {
	public static AbstractFactory getFactory(String objectType) {
		switch (objectType.toLowerCase()) {
		case "tree":
			return new WoodFactory();
		case "mineral":
			return new MineralFactory();
		default:
			return null;
		}
	}

}

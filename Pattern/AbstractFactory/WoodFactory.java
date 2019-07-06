
public class WoodFactory extends AbstractFactory{
	@Override
	Work getObejctToBeWorked(String wood) {
		// TODO Auto-generated method stub
		switch (wood.toLowerCase()) {
			case "cypress":
				return new Cypress();
			case "willow":
				return new Willow();
			default:
				return null;
		}
	}
}


public class MineralFactory extends AbstractFactory{
	@Override
	Work getObejctToBeWorked(String mineral) {
		switch (mineral.toLowerCase()) {
		case "quarzo":
			return new Quarzo();
		case "oliviana":
			return new Oliviana();			
		case "calcite":
			return new Calcite();
		default:
			System.out.println("Nothing correct inserted");
			return null;
		}
	}
}

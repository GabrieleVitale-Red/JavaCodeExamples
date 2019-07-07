
public class MineralFactory extends AbstractFactory{
	@Override
	Work getObejctToBeWorked(String mineral) {
		Work w = null;
		//Creator: declares the Factory that has to return the correct object that has been selected
		switch (mineral.toLowerCase()) {
		case "quarzo":
			return QuartzFactory.getMineralToBeWorked();
		case "oliviana":
			return OlivianaFactory.getMineralToBeWorked();			
		case "calcite":
			return CalciteFactory.getMineralToBeWorked();
		default:
			System.out.println("Nothing correct inserted");
			return w;
		}
	}
}

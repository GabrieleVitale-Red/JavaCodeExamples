
public class Client {

	public static void main(String[] args) {
		
		//Factory 1 for trees
		AbstractFactory workFactory1 = FactoryProducer.getFactory("tree");
		Work workT1 = workFactory1.getObejctToBeWorked("willow");
		workT1.cut();
		Work workT2 = workFactory1.getObejctToBeWorked("CYPRESS");
		workT2.cut();
		
		//Factory 2 for minerals		
		AbstractFactory workFactory2 = FactoryProducer.getFactory("MINeral");
		Work workM1 = workFactory2.getObejctToBeWorked("quarzo");
		workM1.cut();
		Work workM2 = workFactory2.getObejctToBeWorked("calcite");
		workM2.cut();
		Work workM3 = workFactory2.getObejctToBeWorked("oliviana");
		workM3.cut();
	}
}

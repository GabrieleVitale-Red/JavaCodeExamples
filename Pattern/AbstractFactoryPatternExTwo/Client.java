
public class Client {

	public static void main(String[] args) {
		
		//Factory 1 for trees
		AbstractFactory abstractFactory = AbstractFactory.getFactory("willow");
		Tree treeWillow = abstractFactory.createTree();
		treeWillow.getRootType();
		
		AbstractFactory abstractFactor2 = AbstractFactory.getFactory("cypress");
		Tree treeCypress = abstractFactor2.createTree();
		treeCypress.getRootType();

	}
}

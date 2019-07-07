
public class QuartzFactory extends MineralFactory{
	//ConcreteCreator: it creates the actual object 
	public static Work getMineralToBeWorked(){
		return new Quarzo();
	}
}

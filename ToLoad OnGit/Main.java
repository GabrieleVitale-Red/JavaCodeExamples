
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = "w";
		String element = "";
        if((element != null)&&(!element.equals(""))&&(element.contains("|"))){
        	String[] x = element.split("\\|");
        	if(x.length > 1) {
                if((x[1].length() > 0)&&(!x[1].equals(""))) {
                	res = x[1];
                }        		
        	}

        }
        System.out.println(res);
	}

}

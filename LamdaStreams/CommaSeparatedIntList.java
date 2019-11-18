import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.joining;

public class CommaSeparatedIntList {

	public static void main(String[] args) {
		
		List<Integer> llistainteri = Arrays.asList(1,2,3);
		String s2 = commaSepareted(llistainteri);
		System.out.println("ecco la lista comma: "+s2);
		
	}

	
	/**
	 * 
	 * @param list
	 * @return it creates a string having an 'o' before non even numbers in the list 
	 * and an 'e' before even numbers 
	 */
    public static String commaSepareted(List<Integer> list){

    	return list.stream()
    			.map(i -> i %2 == 0 ? "e"+i : "o"+i)
    			.collect(joining(","));	
    }
	
}
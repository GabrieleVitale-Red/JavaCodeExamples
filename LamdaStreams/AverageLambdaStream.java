
import java.util.Arrays;
import java.util.List;

public class AverageLambdaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.println("average value of list is: "+average(l));
	}
	
	public static Double average(List<Integer> list) {
		return list.stream()
				.mapToInt(i -> i)
				.average()
				.getAsDouble();
	}

}

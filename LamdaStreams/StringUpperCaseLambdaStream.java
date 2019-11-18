import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUpperCaseLambdaStream {
	public static void main(String[] args) {
		
		List<String> s = Arrays.asList("hi", "i am", "red");
		
		s = upperCase(s);
		
		s.forEach(System.out::println);
	}

    public static List<String> upperCase(List<String> list){
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}

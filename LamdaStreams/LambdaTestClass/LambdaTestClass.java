import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTestClass {

	public interface Age {
		abstract void getAge();
	}
	static int v =0;

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Lambda", "expressions", "are", "cool");

		//Simple classic external iteration
		for(int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
		}
		//Simple classic external iteration with a foreach
		for(String element : strings) {
			System.out.println(element);
		}

		//Creating an Anonymous class using the interface Consumer and it's abstract method accept
		strings.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
				System.out.println("v "+v);
			}
		});
		//Lambda internal iteration normal version
		strings.forEach((String s) -> System.out.println(s));

		//Lambda internal iteration short version
		strings.forEach(s -> System.out.println(s));

		//Lambda internal iteration shortest version with method reference
		strings.forEach(System.out::println);

	}


}

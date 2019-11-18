import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.crypto.SealedObject;
import javax.lang.model.element.Element;

public class FilteringStringLambdaStreams {

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("air", "cool", "dice", "retro", "zombie", "aim", "all");

		stringList = search(stringList);

		stringList.forEach(System.out::println);

	}

  //ite searches for the strings in the list having 'a' (lower case) as first letter
  //and length equal to 3 then returns them
	public static List<String> search(List<String> list) {
		return list.stream()
				.filter(elem -> elem.charAt(0) == 'a' && elem.length() ==3)
				.map(s -> s)
				.collect(Collectors.toList());
	}

}

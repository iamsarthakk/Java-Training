package pkg1;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleStream5 {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("four");
		
		Stream <String> stream = stringList.stream();
		
		List<String> distinctStrings = stream.distinct().collect(Collectors.toList());
		System.out.println(distinctStrings);
	}

}

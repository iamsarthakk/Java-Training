package pkg1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SampleStream1 {

	public static void main(String[] args) {
		Stream<Integer> stm1 = Stream.of(1, 2, 3, 4 ,5 ,6 ,7 , 8,9);
		stm1.forEach(p->System.out.print(p+" "));
		System.out.println();
		Stream<Integer> stm2 = Stream.of(new Integer[] {10, 20, 30, 40, 50, 60});
		stm2.forEach(p->System.out.print(p+" "));
		System.out.println();
		IntStream stream = "12345_abcdefg".chars();
		stream.forEach(p->System.out.print(p+" "));
	}

}

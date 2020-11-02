
public class GenIFDemo {

	public static void main(String[] args) {
		Integer inums[] = {3, 6, 2, 8, 6};
		Character chs[] = {'b', 'r', 'p', 'w'};
		String sarr[] = {"mumbai", "Bengaluru", "Chennai", "Hydrabad"};
		MyClass<Integer> iob = new MyClass<Integer>(inums);
		MyClass<Character> cob = new MyClass<Character>(chs);
		System.out.println("Max value in inums: "+ iob.max());
		System.out.println("Min value in inums: "+ iob.min());
		System.out.println("Max value in chs: "+ cob.max());
		System.out.println("Min value in chs: "+ cob.min());
		
		MyClass<String> sob =  new MyClass<String>(sarr);
		System.out.println("Max value in sob: "+ sob.max());
		System.out.println("Min value in sob: "+ sob.min());
	}

}

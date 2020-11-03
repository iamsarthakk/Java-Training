package CollectionAlgorithms;

import java.util.Arrays;


public class AlgorithmsDemo {
	static void display(int array[]) {
		for(int i = 0; i < array.length; i++)
		System.out.print(array[i] + " ");
		System.out.println("");
		}

	public static void main(String[] args) {
//		LinkedList<Integer> ll = new LinkedList<Integer>();
//		ll.add(-8);
//		ll.add(20);
//		ll.add(-20);
//		ll.add(8);
//		ll.add(23);
//		ll.add(35);
//		ll.add(-8);
//		ll.add(53);
//		ll.add(12);
//		
//		int i;
//		Comparator<Integer> r = Collections.reverseOrder();
//		Collections.sort(ll);
//		
//		Collections.sort(ll, r);
//		System.out.println("List sorted in reverse: ");
//		for(int i1 : ll) {
//			System.out.print(i1+" ");
//		}
//		System.out.println();
//		i = Collections.binarySearch(ll, 20);
//		System.out.println("2 is at position = "+i);
//		
//		Collections.shuffle(ll);
//		
//		System.out.print("List shuffled: ");
//		for(int i1 : ll){
//			System.out.print(i1+" ");
//			System.out.println();
//			System.out.println("Minimum: "+Collections.min(ll));
//	}
//		
//		int array[] = new int[10];
//		for(int i = 0; i < 10; i++)
//		  { array[i] = (-3) * i; }
//		System.out.print("Original contents: ");
//		display(array);
//		Arrays.sort(array);
//		System.out.print("Sorted: ");
//		display(array);
//		Arrays.fill(array, 2, 6, -1);
//		System.out.print("After fill(): ");
//		display(array);
//		Arrays.sort(array);
//		System.out.print("After sorting again: ");
//		display(array);
//		System.out.print("The value -9 is at location ");
//		int index = Arrays.binarySearch(array, -9);
//		System.out.println(index);
//		}
//
//		static void display(int array[]) {
//		for(int i = 0; i < array.length; i++)
//		System.out.print(array[i] + " ");
//		System.out.println("");
//		}

		int array[] = new int[10];
		for(int i = 0; i < 10; i++)
		  { array[i] = (-3) * i; }
		System.out.print("Original contents: ");
		display(array);
		Arrays.sort(array);
		System.out.print("Sorted: ");
		display(array);
		Arrays.fill(array, 2, 6, -1);
		System.out.print("After fill(): ");
		display(array);
		Arrays.sort(array);
		System.out.print("After sorting again: ");
		display(array);
		System.out.print("The value -9 is at location ");
		int index = Arrays.binarySearch(array, -9);
		System.out.println(index);

	}

}

package p4;

public class SortString {
	static String arr[] = {
			"Sugyan", "Amit", "Sandeep", "Maumita", "Anwesha", "Iliyas"
	};
	
	public static void main(String args[]) {
		for(int j=0;j<arr.length;j++) {
			for(int i = j+1;i<arr.length;i++) {
				if(arr[i].compareTo(arr[j])<0) {
					String t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}
			System.out.println(arr[j]);
		}
		
		String s1 = "ChemMnchery";
		String s2 = "Chemmanur";
		System.out.println(s1.compareTo(s2));
	}
}

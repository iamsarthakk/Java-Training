package p4;

public class SearchAndReplace {

	public static void main(String[] args) {
		String org = "This is a test. This is, too";
		String search = " is", sub = " was ", result = "";
		int i;
		do {
			System.out.println("Original string is "+org);
			i = org.indexOf(search);
			if(i!=-1) {
				result = org.substring(0, i);
				System.out.println(result);
				result += sub;
				System.out.println(result);
				result += org.substring(i+search.length());
				System.out.println(result);
				org = result;
			}
		}while(i!=-1);
	}

}

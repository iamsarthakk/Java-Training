package p4;

public class EqualsDemo {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String(s1);
		String s3 = "Good-bye";
		String s4 = "HELLO";
		System.out.println(s1+" equals "+s2+"->"+s1.equals(s2));
		System.out.println(s1+" equals "+s3+"->"+s1.equals(s3));
		System.out.println(s1+" equals "+s4+"->"+s1.equals(s4));
		System.out.println(s1+" equalsIgnoreCase "+s4+"->"
										+s1.equalsIgnoreCase(s4));
		System.out.println(s1+ "=="+s2+"->"+(s1==s2)); //It compare Addresses and not the content of the object

	}
				

}

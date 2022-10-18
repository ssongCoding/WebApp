package section1;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "apple"; // --> [a][p][p][l][e]
		String s2 = "apple"; // --> 
		Speaker spe1 = new Speaker();
		Speaker spe2 = new Speaker();
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(spe1);
		System.out.println(spe2);
		System.out.println(System.identityHashCode(spe1));
		System.out.println(System.identityHashCode(spe2));
		
		String s3 = "apple";
//		
//		
//		
//		
//		// 주소값 비교
//		System.out.println(s1==s2); // T F
//		System.out.println(s1==s3); // F
//		System.out.println(s1.equals(s2)); // T
//		System.out.println(s1.equals(s3)); // T
//		System.out.println(s2.equals(s3)); // T
	}
}

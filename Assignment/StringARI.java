package Java13;

public class StringARI {

	public void show () {

		String s1 = "Welcome to Java World";
		String s2 = "Welcome";
		String s3 = "-Let us learn";
		String s4 = s1.concat(s3);
	
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s4);
		int index = s1.charAt(5);
		System.out.println("The character at 5th position is " +  (char)index);
		   boolean equals = s1.equalsIgnoreCase(s2);
		   System.out.println(equals);
		  System.out.println(s1.replaceAll("a", "e")); 
		}

	public int findIntStr(String s1, int i) {
		
		return s1.indexOf(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringARI obj = new StringARI();
		obj.show();
		
	}

}

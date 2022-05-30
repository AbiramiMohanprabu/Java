package Java13;

public class StringBuffer {
	
	public void show () {

		String s1 = "This is String Buffer";
		System.out.println(s1);
		System.out.println(s1 + " This is a sample program");
        System.out.println(s1.replace("Buffer", "Builder"));
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer obj = new StringBuffer();
		obj.show();

	}

}

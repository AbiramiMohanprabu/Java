package java8eg;

public class DefaultMethodEg implements Sample {
	
	public static void main(String[] args) {
		
		DefaultMethodEg d = new DefaultMethodEg();
		d.display("Good Morning");
		d.display1();
		Sample.my();
	}
	
	private void display1() {
		// TODO Auto-generated method stub
		
	}

	public void display(String a) {
		
		System.out.println(a);
	}

}

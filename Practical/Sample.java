package java8eg;

public interface Sample {

	void display(String a); //abstract method
	
	default void display() {
		System.out.println("I am default method");
		
	}
	
	static void my() {
		System.out.println("I am static method");
	}
}

package java8eg;

import java.util.Optional;

public class OptionalClassEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] str = new String [5];
		str[3] = "anudip";
		Optional<String> c = Optional.ofNullable(str[3]);
		
		System.out.println(c.isPresent());
		System.out.println(c.orElse("value is not present"));
		
	}

}

package Collections;

import java.util.Scanner;

public class NonRepeatingChar {

	public static void main(String[] args) {
	    try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter input string");
			String s1 = scanner.next();
			char characterArray[] = s1.toCharArray();
			for (int i = 0; i < characterArray.length; i++) {
			  if (s1.lastIndexOf(characterArray[i]) == s1.indexOf(characterArray[i])) {
			    System.out.println("First Non repeated character in a string "
			        + s1 + " is " + characterArray[i]);
			    break;
			  }
			}
		}
	  }
}

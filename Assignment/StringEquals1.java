package Collections;
public class StringEquals1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String cell1 = "Harry Potter";
        String cell2 = "Ronald Weasley";
        String cell3 = "Hermione Granger";

        
        boolean equals1 = cell1.equals(cell2);
        boolean equals2 = cell1.equals(cell3);

        
        System.out.println("\"" + cell1 + "\" equals \"" + cell2 + "\"? " + equals1);
        System.out.println("\"" + cell1 + "\" equals \"" + cell3 + "\"? " + equals2);
	}

}

import java.util.Scanner;

public class Switchcases{

public void display(){
 Scanner s = new Scanner(System.in);
 System.out.println("Enter Day");
 int day = s.nextInt();
 
 switch(day){
case 1:
  System.out.println("Its a Monday");
break; 
case 2:
  System.out.println("Its a Tuesday");
break; 
case 3:
  System.out.println("Its a Wednesday");
break; 
case 4:
  System.out.println("Its a Thursday");
break; 
case 5:
  System.out.println("Its a Friday");
break; 
case 6:
  System.out.println("Its a Saturday");
break;  
default:
 System.out.println("Invalid");
 
}
}
public static void main(String args[]){
Switchcases e = new Switchcases();
e.display();
}
}
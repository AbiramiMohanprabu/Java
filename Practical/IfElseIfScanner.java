import java.util.Scanner;

class IfElseIfScanner{

public void show() {
Scanner s = new Scanner(System.in);
System.out.println("Enter time");
int time = s.nextInt();


if(time <7){
System.out.println("Good morning");
}

else if(time <11){
System.out.println("Good Afternoon");
}

else if(time <15){
System.out.println("Good evening");
}

else{
System.out.println("Good night");
}

}

public static void main(String args[]){
IfElseIfScanner e = new IfElseIfScanner();
e.show();
}

}
class Dowhileexample{

public void display(){
int b= 0;
do
{
System.out.println(" value is :" +b);
b = b-5;
}
while(b>=1);
}
public static void main(String args[]){
Dowhileexample obj = new Dowhileexample();
obj.display();
}
}
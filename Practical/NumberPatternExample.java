class NumberPatternExample{

public void pattern(int num){
for(int i=0; i<num; i++){
  for(int j=0; j<=i; j++){
    System.out.print("1");
	}
	System.out.println();
	
	}
}
public static void main(String args[]){
NumberPatternExample m = new NumberPatternExample();

int num=6;

m.pattern(num);
}

}

class PyramidPatternExample{

public void pattern(int num){
for(int i=0; i<num; i++){
  for(int j=0; j<=i; j++){
    System.out.print("*");
	}
	System.out.println();
	
	}
}
public static void main(String args[]){
PyramidPatternExample m = new PyramidPatternExample();

int num=6;

m.pattern(num);
}

}

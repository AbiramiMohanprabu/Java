class MultiArrayExample{
public void display(){
int arr[][] = {{13,9,1},{6,7,4},{31,6,6}};
for(int i =0;i<3;i++){
  for(int j=0; j<3; j++){
 
 System.out.print(arr[i][j] + " ");
 }
 System.out.println();
}
}
public static void main(String args[]){
MultiArrayExample obj = new MultiArrayExample();
obj.display();
}
}

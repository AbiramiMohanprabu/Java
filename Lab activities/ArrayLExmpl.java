package CollectionEg;

import java.util.LinkedList;

public class ArrayLExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al = new LinkedList<String>();
		al.add("Namjoon");
		al.add("Seok Jin");
		al.add("Yoongi");
		al.add("hoseok");
		al.add("jimin");
		al.add("Taehyung");
		al.add("Jeon jungkook");
		al.add("Army");
		
		String element = al.get(2);
		System.out.println("Get index:" +element);
		System.out.println("Array list is:" +al.isEmpty());
		String element1 = al.remove(3);
		System.out.println("Remove index:" +element1);
		System.out.println("traversing using for loop");
		for (int i = 0; i< al.size(); i++) {
			System.out.println(al.get(i));
		}
}
}
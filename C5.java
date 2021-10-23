import java.util.*;

public class C5 {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		
		System.out.println("before sorting");
		System.out.println(ls);
		
		System.out.println();
		Collections.sort(ls);
		System.out.println("after sorting in ascending");
		System.out.println(ls);
		
		System.out.println();
		Collections.reverse(ls);
		System.out.println("after sorting in descending order");
		System.out.println(ls);

	}

}

import java.util.*;

public class C3 {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		
		Iterator i=ls.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			ls.remove(1);
		}

	}

}

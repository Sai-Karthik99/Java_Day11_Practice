
public class W6 {

	public static void main(String[] args) {
		int a1=90;
		Integer a2=a1;//boxing
		Object o=a2;
		Integer i=(Integer)o;
		int a=i;//un boxing
		System.out.println(a);//90
	}

}

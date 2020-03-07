public class HelloWorld {

	public static void main(String[] args) {
		Integer i = 3;
		int imin;// = i.MIN_VALUE;
//		int imax = i.MAX_VALUE;
		System.out.println(i);
//		System.out.println(imax);
		HelloWorld h = new HelloWorld();
		System.out.println(h.met(1, 23.3));

	}
	static double met(int i, double d) {
		System.out.println(i++);
		return met( i, d);
	}

} 
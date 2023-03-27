package polimorphism;



public class MethodOverLoading {

	public void aesd(int a) {

		System.out.println(a);

	}

	public void aesd(int a, int b) {

		System.out.println(a+b);

	}

	public void aesd(int a, double c) {

		System.out.println(a+c);

	}

	public void aesd(int a, int f, int n) {

		System.out.println(a+f+n);

	}

	public static void main(String[] args) {

		MethodOverLoading obj = new MethodOverLoading();

		obj.aesd(300);
		obj.aesd(500, 500.5);
		obj.aesd(8000, 5000);
		obj.aesd(2000, 4000, 06000);
	}

}

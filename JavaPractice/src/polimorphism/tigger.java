package polimorphism;


public class tigger{
	public void move() {
		System.out.println("Animal van move");

	}

	public class Dog extends tigger {

		public void animals() {
			System.out.println("Dog can walk and run");

		}

		public static void main(String[] args) {
			Dog obj=new Dog();
			obj.move();
			obj.animals();
			
			
		}

	}
}
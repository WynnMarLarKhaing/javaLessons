public class SuperCall {
	public static void main(String[] args) {
		Child obj = new Child();
	}
}

class Parent{
	Parent(){
		System.out.println("Default constructor of parent.");
	}
	
	Parent(int a, int b){
		System.out.println("Default constructor 2 parameters of parent.");
	}
	
	Parent(int a, int b, int c){
		System.out.println("Default constructor 3 parameters of parent.");
	}
}

class Child extends Parent{
	Child(){
		super(10,20);
		System.out.println("Default constructor of child");
	}
}
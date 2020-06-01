
public class Inheritance {
	public static void main(String[] args) {
		C1 obj1 = new C1();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		obj1.m1();
		obj1.m2();
		
		C2 obj2 = new C2();
		obj2.m5();
		obj2.m4();
	}
}

class C1{
	int a = 10;
	int b = 20;
	int e = 50;
	
	void m1() {
		System.out.println("m1 method of C1");
	}
	
	void m2() {
		System.out.println("m2 method of C1");
	}
	
	void m5() {
		System.out.println("m5 method of C1");
	}
}

class C2 extends C1{
	int a = 10;
	int b = 20;
	int c = 20;
	int d = 20;
	
	void m1() {
		System.out.println("m1 method of C1");
	}
	
	void m2() {
		System.out.println("m2 method of C1");
	}
	
	void m3() {
		System.out.println("m3 method of C1");
	}
	
	void m4() {
		System.out.println("m4 method of C1"+e);
	}
}

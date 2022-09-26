package sec03_constructor.EX02_ConstructorOverloading;

class A {
	A() {
		System.out.println("霉 锅掳 积己磊");
	}
	A(int a) {
		System.out.println("滴 锅掳 积己磊");
	}
	A(int a, int b) {
		System.out.println("技 锅掳 积己磊");
	}
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		A a1 = new A(); // 霉 锅掳 积己磊 积己
		A a2 = new A(3); // 滴 锅掳 积己磊 积己
		A a3 = new A(3, 5); // 技 锅掳 积己磊 积己
	}
}

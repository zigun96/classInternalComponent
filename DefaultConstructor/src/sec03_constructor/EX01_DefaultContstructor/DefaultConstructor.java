package sec03_constructor.EX01_DefaultContstructor;

class A {
	int m;
	void work() {
		System.out.println(m);
	}
	/*
	 * A() {
	 * 
	 * }
	 */
}
class B {
	int m;
	void work() {
		System.out.println(m);
	}
	B() {
		
	}
}
class C {
	int m;
	void work() {
		System.out.println(m); // �����ڷ� �Ѿ�� ��
	}
	C(int a) {
		m = a;
	}
}

public class DefaultConstructor {
	public static void main(String[] args) {
		
		// Ŭ������ ��ü ����
		A a = new A();
		B b = new B();
		//C c = new C();
		C c = new C(3);
		
		// �޼��� ȣ��
		a.work();
		b.work();
		c.work();
	}
}

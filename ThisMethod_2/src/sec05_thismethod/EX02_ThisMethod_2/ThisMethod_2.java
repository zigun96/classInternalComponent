package sec05_thismethod.EX02_ThisMethod_2;

class A {
	int m1, m2, m3, m4;
	A(){ // 생성자 A에 대한 다형성을 볼 수 있다. (같은 이름을 가진 생성자 A가, 매개변수에 따라 하는 일이 달라짐)
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	A(int a) {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	A(int a, int b) {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();
	}
}
class B {
	int m1, m2, m3, m4;
	B() {
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	B(int a) {
		this();
		m1 = a;
	}
	B(int a, int b) {
		this(a);
		m2 = b;
	}
	/*
	 * B(int a, int b) {
	 *	this();
	 *	m1 = a;
	 *	m2 = b;
	 *}
	 */
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();
	}
}
public class ThisMethod_2 {
	public static void main (String[] args) {
		// 3가지 객체 생성(this() 미사용)
		A a1 = new A();
		A a2 = new A(10);
		A a3 = new A(10, 20);
		a1.print();
		a2.print();
		a3.print();
		System.out.println();
		
		// 3가지 객체 생성(this() 미사용)
		B b1 = new B();
		B b2 = new B(10);
		B b3 = new B(10, 20);
		b1.print();
		b2.print();
		b3.print();
	}
}

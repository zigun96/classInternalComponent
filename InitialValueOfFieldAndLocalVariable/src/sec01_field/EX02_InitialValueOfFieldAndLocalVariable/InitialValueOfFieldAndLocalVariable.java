package sec01_field.EX02_InitialValueOfFieldAndLocalVariable;

// Ŭ���� ����(����)
class A {
	boolean m1;
	int m2;
	double m3;
	String m4;
	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	void printLocalVriable() {
		int k;
		// System.out.println(k);
	}
}
public class InitialValueOfFieldAndLocalVariable {
	public static void main(String[] args) {
		// Ŭ������ Ȱ���� ��ü ����
		A a = new A();
		// ��ü Ȱ��
		a.printFieldValue();
	}
}

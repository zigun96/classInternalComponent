package sec02_method.EX03_ArrayArgumentMethod;

import java.util.Arrays;

public class ArrayArgumentMethod {
	public static void main(String[] args) {
		// �迭�� �Է¸Ű������� �ϴ� �޼��� ȣ��
		int[] a = new int[] {1, 2, 3};
		printArray(a); // �������� �Ű������� �ѱ�
		printArray(new int[] {1, 2, 3}); // �迭�� �Ű������� �ѱ�
		// printArray({1, 2, 3}); // �����߻�
	}
	public static void printArray(int a[]) {
		System.out.println(Arrays.toString(a)); // ������ ����� ����
	}
}

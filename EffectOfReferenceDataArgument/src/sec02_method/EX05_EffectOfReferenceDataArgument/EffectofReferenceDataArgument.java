package sec02_method.EX05_EffectOfReferenceDataArgument;
/*���� �ڷ��� �Ű��������� ��ȭ*/

import java.util.Arrays;

public class EffectofReferenceDataArgument {
	public static void main (String[] args) {
		int[] array = new int[] {1, 2, 3};
		modifyData(array);
		printArray(array);
	}
	
	public static void modifyData(int[] a) {
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
	}
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}

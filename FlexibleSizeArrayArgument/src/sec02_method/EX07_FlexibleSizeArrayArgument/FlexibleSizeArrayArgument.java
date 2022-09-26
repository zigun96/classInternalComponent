package sec02_method.EX07_FlexibleSizeArrayArgument;

public class FlexibleSizeArrayArgument {
	public static void main(String[] args) {
		// method1(int...values)
		method1(1, 2);
		method1(1, 2, 3);
		method1();
		// method2(String...values)
		method2("�ȳ�","�氡");
		method2("��ť","����","����");
		method2();
	}
	public static void method1(int...values) {
		System.out.println("�迭�� ����: " + values.length);
		/* �迭 ��� ��� 1
		 * for (int i = 0; i <valueslength; i++){
		 * System.out.println(values[i] + " " );
		 } */
		
		// �迭 ��� ��� 2
		for(int k: values) {
			System.out.print(k + " ");
		}
		/* �迭 ��� ��� 3
		 * System.out.printlm(Arrays.toString(values));
		 */
		System.out.println();
	}
	public static void method2(String...values) {
		System.out.println("�迭�� ����: " + values.length);
		/* �迭 ��� ��� 1
		 * for (int i = 0; i <valueslength; i++){
		 * System.out.println(values[i] + " " );
		 } */
		
		// �迭 ��� ��� 2
		for(String k: values) {
			System.out.print(k + " ");
		}
		/* �迭 ��� ��� 3
		 * System.out.printlm(Arrays.toString(values));
		 */
		System.out.println();
	}
}

package sec02_method.EX03_ArrayArgumentMethod;

import java.util.Arrays;

public class ArrayArgumentMethod {
	public static void main(String[] args) {
		// 배열을 입력매개변수로 하는 메서드 호출
		int[] a = new int[] {1, 2, 3};
		printArray(a); // 변수명을 매개변수로 넘김
		printArray(new int[] {1, 2, 3}); // 배열을 매개변수로 넘김
		// printArray({1, 2, 3}); // 오류발생
	}
	public static void printArray(int a[]) {
		System.out.println(Arrays.toString(a)); // 동일한 출력이 나옴
	}
}

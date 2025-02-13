package day7;

import java.util.Arrays;
import java.util.Comparator;

public class _04_ArrayOrder {

	public static void main(String[] args) {
		int[] arr = {1,6,2,3,10,7,4,5,8,9};
		int temp = 0; // 숫자를 저장하는 임시저장소 두 값을 바꿔야 할 때 잠시 여기다 넣을거임!

		for(int i = arr.length-1; i > 0; i-- ) {
			for(int j = 0; j < i;j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		
		System.out.print("정렬 후 출력 : ");
		for(int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		System.out.println("\n");
		int[] arr2 = {1,6,2,3,10,7,4,5,8,9};
		System.out.println("정렬 전 배열 : " + Arrays.toString(arr2));
		
		Arrays.sort(arr2);
		System.out.println("정렬 후 배열 : " + Arrays.toString(arr2));
		
		
		Integer[] arr3 = {1,6,2,3,10,7,4,5,8,9};
		System.out.println("내림차순 정렬 전 배열 : " + Arrays.toString(arr3));
		Arrays.sort(arr3,Comparator.reverseOrder());
		System.out.println("내림차순 정렬 후 배열 : " + Arrays.toString(arr3));
	}

}

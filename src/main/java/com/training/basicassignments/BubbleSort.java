package com.training.basicassignments;

public class BubbleSort {

	public static int[] sort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		return arr;

	}

}

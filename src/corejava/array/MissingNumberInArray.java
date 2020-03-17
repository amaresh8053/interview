package corejava.array;

import java.util.Scanner;

public class MissingNumberInArray {

	public static void main(String[] args) {

		
		/*
		 * Exam:--Input: arr[] = {1, 2, 4,, 6, 3, 7, 8} Output: 5
		 */
		int tcs;
		Scanner s = new Scanner(System.in);
		tcs = s.nextInt();
		while (tcs != 0) {
			tcs--;
			int size = s.nextInt();
			int array[] = new int[size-1];
			int i;
			for (i = 0; i < size - 1; i++) {
				array[i] = s.nextInt();
			}
			//array[i] = 0;
			System.out.println(missingNumberSolutionTwo(array));

		}

	}

	public static int missingNumberSolutionOne(int[] nums) {

		int sumTotal = (nums.length + 1) * nums.length / 2;
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}

		return sumTotal - sum;
	}

	public static int missingNumberSolutionTwo(int[] nums) {
		int totalXor = 0;
		int arrayXor = 0;
		
		for (int i = 0; i < nums.length; i++) {
			totalXor = totalXor ^ i;
			arrayXor = arrayXor ^ nums[i];
		}
		totalXor=totalXor^nums.length;
		totalXor=totalXor^5;
		System.out.println(totalXor);
		System.out.println(arrayXor);
		return totalXor ^ arrayXor;
	}

}

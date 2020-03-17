package corejava.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of the Array");

		int arraySize = sc.nextInt();
		int nums[] = new int[arraySize];

		System.out.println("Enter the array Elements");

		for (int i = 0; i < arraySize; i++) {
			nums[i] = sc.nextInt();
		}

		System.out.println("Enter the target ");

		int target = sc.nextInt();

		System.out.println(solutionOne(nums, target));

	}

	public static int[] solutionOne(int nums[], int target) {
		// Solution 1:- We can sort the array and find two number by comparing with the
		// target,but problem is we will lose the original position of the two number
		int result[] = new int[2];
		int l = 0;
		int r = nums.length - 1;
		Arrays.sort(nums);
		while (l < r) {
			if (nums[l] + nums[r] < target) {
				l++;
			} else if (nums[l] + nums[r] > target) {
				r--;
			} else {
				result[0] = nums[l];
				result[1] = nums[r];
				break;
			}
		}
		return result;
	}

	public static int[] solutionTwo(int nums[], int target) {
		int result[] = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int secondNumber = target - nums[i];
			if (map.containsKey(secondNumber)) {
				result[0] = i;
				result[1] = map.get(secondNumber);
			}
			map.put(nums[i], i);
		}
		return result;
	}

}

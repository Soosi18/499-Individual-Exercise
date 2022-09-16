import java.util.*;

public class MinMax {

	public static void main(String[] args) {
		
		//declare and initialize 'nums' array with random values
		int[] nums = new int[5];
		Random r = new Random();
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(100);
		}
		
		//print contents of nums array
		System.out.println("nums Array: " + Arrays.toString(nums));
		
		
		//print results of findMin and findMax methods
		System.out.println("Smallest value in nums: " + findMin(nums));
		System.out.println("Largest value in nums: " + findMax(nums));
	}
	
	
	//find smallest value in 'nums' array
	public static int findMin(int[] nums) {
		int min = 101;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
		}	
		return min;
	}
	
	
	//find largest value in 'nums' array
	public static int findMax(int[] nums) {
		int max = -1;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
		}	
		return max;	
	}
	
}

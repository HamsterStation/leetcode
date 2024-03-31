package array;

public class SearchInsert {
	 public int searchInsert(int[] nums, int target) {
		 int i;
		 for(i =0 ;i<nums.length;i++) {
			 if(target < nums[0]) {
				 return 0;
			 }
			 if(target > nums[nums.length -1]) {
				 return nums.length;
			 }
			 if((target >nums[i] && target <nums[i+1]) ) {
					 return i +1;
			 }
			 if(target == nums[i]) {
					 return i;
			 }
		 } 
		 return 1;
	}
	public static void main(String[] args) {
		SearchInsert si = new SearchInsert();
		int[] nums = {1,3};
		int target = 3;
		System.out.println(si.searchInsert(nums, target));

	}

}

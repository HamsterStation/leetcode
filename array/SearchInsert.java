package array;

public class SearchInsert {
	//本题出现的问题， 未能彻底把控数组的边界
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

	//简单的思路，如果数组里面的元素大于或者等于target直接return i
	//如果遍历完之后还是没有的话，那就插入末尾
	public int searchInsert1(int[] nums, int target) {
	for(int i=0;i<nums.length;i++){
	    if(nums[i]>=target) return i;
	}
	return nums.length;
    }

	public static void main(String[] args) {
		SearchInsert si = new SearchInsert();
		int[] nums = {1,3};
		int target = 3;
		System.out.println(si.searchInsert(nums, target));

	}

}

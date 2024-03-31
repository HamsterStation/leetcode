package array;

public class SearchCenter {
	public int pivotIndex(int[] nums) {
        //本题的问题：第一次我将变量初始化的时候放在开始了，
		//我忘记每一次遍历的时候都要让他俩等于0才行
        //计算之前的数 让他等于之后的数；
        for(int i =0;i<nums.length;i++){
        	int sum1 = 0;
            int sum2 = 0;
            //i 为0 的情况
                if(i == 0){
                    sum1 =0;
            }
            // i 为 nums.length -1的情况
                if(i == nums.length -1){
                    sum2 =0;
                }
            //i >= 1 且 i < nums.length -1
            for(int k=0;k<i;k++){
                sum1 += nums[k];
            }
            for(int j = i+1;j<nums.length;j++){
                sum2 += nums[j];
            }
            if(sum1 == sum2)
                return i;
        }
            return -1;

    }
	public static void main(String[] args) {
		int[] nums = {2, 1, -1};
		SearchCenter searchcenter = new SearchCenter();
		System.out.println(searchcenter.pivotIndex(nums));
	}

}

package cyclicsort;

class MissingNum {
	static void swap(int[] nums, int i, int j) {
		int temp = nums[j];
		nums[j] = nums[i];
		nums[i] = temp;
	}
	
    static int missingNumber(int[] nums) {
    	int i = 0;
    	while(i<nums.length) {
    		int correct = nums[i];
    		if(nums[i]<nums.length && nums[i]!=nums[correct]) {
    			swap(nums, i, correct);
    		}else {
    			i++;
    		}
    	}
    	for(int j=0; j<nums.length; j++) {
    		if(nums[j]!=j) {
    			return j;
    		}
    	}
        return nums.length;
    }
    public static void main(String[] args) {
		int[] nums = {0,2,4,3};
		int ans = missingNumber(nums);
		System.out.println(ans);
	}
}

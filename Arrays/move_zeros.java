class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int len = nums.length-1;
        for(int i=0;i<=len;i++){
            if(nums[i]!=0)
            nums[index++] = nums[i];
        }
        for(int i=index;i<=len;i++){
            nums[index++]=0;
        }
    }
}

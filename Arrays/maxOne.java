class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int end = 0;
        int windowsize =0,maxlen=0;
        while(end < nums.length ){
            if(nums[end]==1){
                windowsize ++;
                maxlen = Math.max(windowsize,maxlen);
                end++;
            }
            else{
                windowsize = 0;
                end++;
            }
        }
        return maxlen;
    }
}

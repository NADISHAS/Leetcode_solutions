class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i !=0 && nums[i-1] == nums[i]) continue;
          int  j=i+1;
          int k = nums.length-1;
          while(j<k){
            int currentsum = nums[i]+nums[j]+nums[k];
            if(currentsum > 0){
                k --;
            }
           else if(currentsum < 0){
                j ++;
            }
            else{
                List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                result.add(temp);
                j++;
                k--;
                while(j<k && nums[j-1]== nums[j]) j++;
                while(j<k && nums[k+1]== nums[k]) k--;
            }
            
          }

        }
        return result;
    }
}

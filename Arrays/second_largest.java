class Solution {
    public int getSecondLargest(int[] arr) {
        int len = arr.length;
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        if(len < 2) return -1;
        for(int i=0;i<len;i++){
            if(arr[i] > max){
                second_max = max;
                max = arr[i];
            }
            if(arr[i] > second_max && arr[i] != max){
                second_max = arr[i];
            }
        }
        return second_max > 0 ? second_max : -1;
    }
}

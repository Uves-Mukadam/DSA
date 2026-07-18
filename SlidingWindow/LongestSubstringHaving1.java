class Solution {
    public int LongestSubstringHaving1(int[] nums, int k) {
        int one = 0  ; 
        int zero =  0 ; 
        int max = 0 ; 
        int low = 0 ; 
        for (int high = 0 ; high < nums.length ; high++ ){
            if(nums[high]==1){
                one++;

            }else {
                zero++ ; 
            }
            int len = (high-low) + 1; 
            while(len-one>k && low<=high){
                if(nums[low]==1){
                      one-- ; 
                }
                else{
                    zero-- ; 
                }
                low++ ; 
                len = (high-low)+1 ; 
            } 
            max = Math.max(max , len) ; 

        }
        return max ; 
    }
}
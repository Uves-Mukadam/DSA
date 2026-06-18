class MinSizeK {
   public int minSubArrayLen(int target, int[] nums) {
        int low = 0 ;
        int high = 0 ; 
        int sum = 0;
        int result = nums.length+1 ; 
        int r1 = 0 ;
        while(high<nums.length && low<=high){
             sum = sum + nums[high];
            
            while(sum >= target){
                r1 = (high-low)+1;
                if(r1<result){
                    result = r1 ; 
                }
                sum = sum-nums[low];
                low++ ;
            }
          
               high ++ ;    
            
        }
        if(result>nums.length){
            return 0 ;
        }
        return result ; 
}
}
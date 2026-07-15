class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        int low = 0 ;
        double max = Double.NEGATIVE_INFINITY; 
        int sum = 0 ; 
        for(int high = k-1 ; high < nums.length ; high++){
            while(low<=high){
                sum = sum+nums[low] ;
                low++ ; 
                
            }
            max = Math.max(max,(double)sum/k); 
            sum = 0 ; 
            low = high-(k-2) ; 
        }      
        return max ; 
    }
}
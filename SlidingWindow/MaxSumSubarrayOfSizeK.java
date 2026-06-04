class MaxSubarrayOfSizeK {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum1 = 0  ;

        for(int i = 0 ; i<=k-1 ; i++){
            sum1 = arr[i] + sum1 ;
        }
        if(arr.length == k ){
            return sum1 ;
        }
        int max = sum1 ;
        for ( int i = k ; i < arr.length ; i++ ) {
            sum1 = sum1 + arr[i] - arr[i-k] ;
            if( sum1 > max ){
                max = sum1 ;
            }


        }
        return max ;
    }

}
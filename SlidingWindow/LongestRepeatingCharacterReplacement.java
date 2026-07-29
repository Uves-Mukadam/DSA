public class LongestRepeatingCharacterReplacement {
   public int characterReplacement(String s, int k) {
        int[] arr = new int[256] ; 
        int low = 0 ; 
        int res = 0 ; 
        for(int i=0 ; i < s.length() ; i++){
            arr[(int) s.charAt(i)]++ ; 
            int max = maxValue(arr) ; 
            int len = (i-low)+1 ; 
            int diff = len - max ; 
            while(diff>k){
                arr[(int)s.charAt(low)]-- ; 
                low++ ; 
                max = maxValue(arr) ; 
                len = (i-low)+1 ;
                diff = len - max ;  
               
                
            }
            len = (i-low)+1 ; 
            res = Math.max(res, len) ; 
        }
        return res ; 
        
      
    }
    int maxValue (int[] arr) {
        int max = 0 ; 
        for(int i = 0 ; i < arr.length ; i++){
            max = Math.max(max, arr[i]);
        }
        return max ; 
    }
}
  

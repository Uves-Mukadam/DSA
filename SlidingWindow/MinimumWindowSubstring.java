class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        
        int[] have = new int[256] ; 
        int[] need = new int[256];
        int start = 0 ; 
        int res = Integer.MAX_VALUE ; 
        int len = 0 ; 
        int low = 0 ;
         for(int i = 0 ; i<t.length(); i++ ){
            need[t.charAt(i)]++ ; 
         } 
        for(int high = 0 ; high < s.length() ; high++){
            have[s.charAt(high)]++ ; 
            while(isAvailable(have,need)){
                len = (high-low)+1 ; 
                if(res>len){
                    res = len ; 
                    start = low ; 
                }
                 
                have[s.charAt(low)]--;
                low++ ; 
                
            }
           
        } 
        if(res==Integer.MAX_VALUE){
            return "";
                    }
        return s.substring(start,start+res) ;   
        
    }
    boolean isAvailable(int[] have , int[] need){
        for(int i = 0 ; i < have.length ; i++ ){
            if(have[i]<need[i]){
                return false ; 
            }
        }
        return true ; 
    }
  
}
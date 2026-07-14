import java.util.HashMap;

class LongestSubstringHavingKelements {
    public int longestKSubstr(String s, int k) {
        HashMap <Character , Integer> st = new HashMap<>() ; 
        int low = 0 ; 
        int result = -1 ; 
        for(int high = 0 ; high<s.length() ; high++){
            
            
             st.put((s.charAt(high)) , st.getOrDefault((s.charAt(high)),0)+1);
            
            while(st.size() > k ){
                
                st.put(s.charAt(low) , st.get(s.charAt(low))-1  );
                if(st.get(s.charAt(low)) == 0 ) {
                     st.remove(s.charAt(low)) ; 
                }
                low++ ; 
            }
             if(st.size()==k){
                int length = (high-low)+1 ; 
                result = Math.max(length, result) ;
                continue ; 
             

             }
          
        }
        return result ; 
        
    }
}
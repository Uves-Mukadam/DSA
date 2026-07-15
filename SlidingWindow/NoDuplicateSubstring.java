import java.util.HashMap;

public class NoDuplicateSubstring {
    
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>() ; 
        int low = 0 ; 
        int max = 1 ; 
        if(s.length()<=1){
            return s.length() ; 
        }
        for(int high = 0 ; high < s.length() ; high++){
            map.put(s.charAt(high) ,map.getOrDefault(s.charAt(high),0)+1) ; 
            while(map.get(s.charAt(high))>1 && low<high){
                map.put(s.charAt(low),map.get(s.charAt(low))-1) ; 
                if(map.get(s.charAt(low))==0){
                    map.remove(s.charAt(low));
                }
                low++ ; 
            }
            max = Math.max(max,(high-low)+1) ; 
        }
        return max ; 
    }
    

}

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] chars = new int[256] ; 
        for(int i ; i < s.length() ; i++){
            chars[(int) s.charAt(i)]++ ; 
        }
      
    }
}
  

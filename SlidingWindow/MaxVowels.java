public class MaxVowels {
    
    public int maxVowels(String s, int k) {
    int max = 0 ;
    int vowel = 0 ;
       
       
      for(int i=0 ; i<k ; i++){
        if(isVowel(s.charAt(i))){
            vowel++ ; 
        }
      }
      max = vowel ; 
      for(int i = k ; i<s.length() ; i++){
        if(isVowel(s.charAt(i-k))){
            vowel--;
        }
        if(isVowel(s.charAt(i))){
            vowel++ ; 
        }
        max = Math.max(max,vowel) ; 
      }
        return max ; 
    }
    public boolean isVowel(char a){
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
            return true ; 
        }
        return false ; 
    }


}


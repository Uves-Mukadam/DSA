package TwoPointer;

public class Palindrome {
    public boolean isPalindrome(String s) {
        String fresh = s.toLowerCase().replaceAll("[^a-z0-9]" , "");
       int low = 0 ;
        int high = fresh.length()-1 ; 
        for(int i = 0 ; i<(fresh.length()/2) ; i++){
         
            if(fresh.charAt(low)==fresh.charAt(high)){
                low++ ; 
                high-- ; 
            }
            else {
                return false ; 
            }


        }
        return true ; 
    }
}

package TwoPointer;

public class ReverseArray {
    
    public void reverseString(char[] s) {
        char temp = 'a';
        int low = 0 ; 
        int high = s.length-1 ;  
        for(int i = 0 ; i < s.length/2 ; i++ ){
            temp = s[low];
            s[low]=s[high];
            s[high]=temp ; 
            low++;
            high--;

        }
    }
}


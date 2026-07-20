class lengthOfLastWordInString {
    public int lengthOfLastWord(String s) {
      int last = s.length()-1 ; 
      int count = 0 ; 
      while(s.charAt(last) == ' '){
        last-- ; 
      }
      for(int i = last ; i>=0 ; i-- ){
        if(s.charAt(i)!= ' '){
            count++;
        }else {
            return count ; 
        }
      }
      return count ; 
    }
}
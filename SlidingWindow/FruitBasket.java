import java.util.HashMap;

class FruitBasket {
    public int totalFruit(int[] fruits) {
        int maxFruits = 1 ; 
        HashMap <Integer , Integer> map = new HashMap<>();
        int low = 0 ; 
        if(fruits.length==1){
            return 1 ;
        }
        else if (fruits.length==2){
            return 2 ; 
        }
       
        for ( int high = 0 ; high<fruits.length ; high++){
            map.put(fruits[high],(map.getOrDefault(fruits[high],0)+1));
           
             while(map.size() > 2 && low<=high){
                map.put(fruits[low], map.get(fruits[low])-1) ; 
                if(map.get(fruits[low])==0){
                    map.remove(fruits[low]);
                }
                low++  ; 
             }
               if(map.size() <= 2  ){
                int length = (high - low) +1 ; 
                maxFruits = Math.max(maxFruits, length);
             }
            

        }
        return maxFruits ; 
    }
}
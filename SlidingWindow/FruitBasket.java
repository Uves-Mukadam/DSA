class FruitBasket {
    public int totalFruit(int[] fruits) {
        int maxFruits = 0 ; 
        Hashmap()<Integer , Integer> map = new HashMap()<>;
        for ( int i = 0 ; i<=fruits.length-1 ; i++){
            map.put(fruits[i],getOrDefault(fruits[i],0)+1);
        }
        
    }
}
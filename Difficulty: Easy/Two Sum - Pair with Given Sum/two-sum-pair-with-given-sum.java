class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        if(arr.length == 1)return false;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : arr){
            if(set.contains(target-i)){
                return true;
            }else{
                set.add(i);
            }
        }
    
    
        
        return false;
        
        
    }
}
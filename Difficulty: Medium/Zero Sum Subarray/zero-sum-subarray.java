class Solution {
    public boolean subArrayExists(int arr[]) {
        // code here
        
        
        
        // for(int i = 0 ; i<arr.length;i++){
        //     int sum = 0;
            
        //     for(int j = i ;j<arr.length;j++){
                
        //         sum += arr[j];
        //         if(sum==0){
        //             return true;
        //         }
                
                
        //     }
            
            
        // }
        // return false;
        
        HashSet<Integer> s = new HashSet<>();
        int pre = 0 ; 
        for(int i : arr){
            pre += i;
            if(s.contains(pre) || pre==0){
                return true;
            }else{
                s.add(pre);
            }
           
            
        }
        return false;
        
        
        
        
        
        
        
        
        
        
    }
}



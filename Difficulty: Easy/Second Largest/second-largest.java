class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int first = -1;
        int second = -1; 
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
                
            }
        }
        return second;
    }
}
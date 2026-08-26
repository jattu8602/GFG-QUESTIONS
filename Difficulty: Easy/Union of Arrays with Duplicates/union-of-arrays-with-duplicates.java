class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : a){
            set.add(i);
        }
        for(int i : b){
            set.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : set){
            list.add(i);
        }
        return list;
    }
}
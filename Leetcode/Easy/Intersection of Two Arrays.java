class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs= new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i < nums1.length ; i++){
            hs.add(nums1[i]);
        }
           
            for( int i = 0 ; i < nums2.length ; i++ ){

                if(hs.contains(nums2[i])){
                    ans.add(nums2[i]);
                    hs.remove(nums2[i]);
                }
                }

                int [] arr = new int[ans.size()];

                for(int i = 0; i < ans.size() ; i++ ){
                    arr[i] = ans.get(i);
                }

                return arr ;

            }
}


      
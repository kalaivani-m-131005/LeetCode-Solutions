class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[1001];
        int count = 0;
        
        
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !seen[nums1[i]]) {
                    seen[nums1[i]] = true; 
                    count++;              
                }
            }
        }
        

        int[] result = new int[count];
        int index = 0;
        for (int num = 0; num <= 1000; num++) {
            if (seen[num]) {
                result[index++] = num;
            }
        }
        
        return result;
    }
}
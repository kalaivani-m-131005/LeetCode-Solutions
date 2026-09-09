class Solution {
    public int mySqrt(int x) {
        int i = 0;
        while ((long) i * i <= x) {  // use long to avoid overflow
            i++;
        }
        return i - 1;  // last valid number
    }
}

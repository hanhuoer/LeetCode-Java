class Solution {
    /**
     * 1010101010101010101010101010101
     */
    public boolean isPowerOfFour(int num) {
        return num > 0 
            && (num & (num - 1)) == 0 
            && (num & 0x55555555) == num;
    }
}
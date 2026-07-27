class Solution {
    public int maxProduct(int[] nums) {
        int large = 0;
        int slarge = 0;
        for (int num : nums) {
            if (num > large) {
                slarge = large;
                large = num;
            } else {
                slarge = Math.max(slarge, num);
            }
        }
        return (large - 1) * (slarge - 1);
    }
}
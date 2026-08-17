class Solution {
        public int sqroot(int num) {
        int low = 1, high = num, ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid <= num / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        int sqrt = (int) sqroot(num);
        return sqrt * sqrt == num;
    }
}

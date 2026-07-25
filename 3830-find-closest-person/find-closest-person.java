class Solution {
    public int findClosest(int x, int y, int z) {
        int a = (Math.abs(x - z) < Math.abs(y - z)) ? 1
                : (Math.abs(y - z) < Math.abs(x - z) ? 2 : 0);
        return a;

    }
}
class Solution {
    public List<Integer> generateRow(int r) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        int res = 1;
        for(int j = 1; j < r; j++) {
            res = res * (r - j);
            res = res/j;
            row.add(res);
        }
        return row;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
         for(int i = 1; i <= numRows; i++) {
            ans.add(generateRow(i));
        }
        return ans;
    }
}
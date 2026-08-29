class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>triangle=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>temp=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                temp.add(1);
            }
            for(int k=1;k<i;k++){
                temp.set(k,triangle.get(i-1).get(k-1)+triangle.get(i-1).get(k));
            }
            triangle.add(temp);
        }
        return triangle;
    }
}
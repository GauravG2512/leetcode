class Solution {
    public double[] internalAngles(int[] sides) {
        double a=sides[0];
        double b=sides[1];
        double c=sides[2];
        if(a+b<=c||a+c<=b||b+c<=a){
            return new double[0];
        }
        Double A=Math.acos((b*b+c*c-a*a)/(2*b*c))*180.0/Math.PI;
        Double B=Math.acos((a*a+c*c-b*b)/(2*a*c))*180.0/Math.PI;
        Double C=Math.acos((b*b+a*a-c*c)/(2*b*a))*180.0/Math.PI;

        double[] ans=new double[]{A,B,C};
        Arrays.sort(ans);
        return ans;
        
    }
}
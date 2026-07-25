class Solution {
        public int rev(int n){
        int r=0;
        while (n > 0){
            r=r*10+(n%10);
            n/= 10;
        }
        return r;
    }
    
    public boolean isPrime(int x){
        if (x <= 1) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        for(int i=3;i*i<=x;i+=2){
            if(x%i==0) return false;
        }
        return true;
    }

    public int sumOfPrimesInRange(int n){
        int r=rev(n);
        int sum=0;
        int min=Math.min(n,r);
        int max=Math.max(n,r);
        for(int i=min;i<=max;i++){
            if(isPrime(i)) 
            sum+=i;
        }
        return sum;
    }
}
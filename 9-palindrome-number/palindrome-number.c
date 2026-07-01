bool isPalindrome(int x) {
    if(x<0 ){
        return false;
    }
    long int r=0,temp=0;
    temp=x;
    while(x!=0){
        r=r*10+(x%10);
        x/=10;
    }
    if(r!=temp){
        return false;
    }
    return true;
}
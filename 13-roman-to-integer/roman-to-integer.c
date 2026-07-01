int romanToInt(char* s) {
    int res=0;
    int previous=0;
    char rom[]={'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    int val[]={1,5,10,50,100,500,1000};
    for (int i=strlen(s)-1;i>=0;i--){
        for (int j=0;j<7;j++){
            if(s[i]==rom[j]){
                 if (val[j] < previous){
                    res -= val[j];
                 }
                 else{
                    res+=val[j];
                 }
                 previous=val[j];
            }
        }
    }
    return res;
}
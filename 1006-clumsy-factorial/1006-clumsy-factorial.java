class Solution {
    public int clumsy(int n) {
        int temp=n;
        int ans=0;
        n--;
        int op=0;
        while(n>0){
            if(op==0){
                temp*=n;
            }
            else if(op==1){
                temp/=n;
            }
            else if(op==2){
                ans=ans+temp;
                temp=n;
            }
            else{
                ans=ans+temp;
                temp=-n;
            }
            op=(op+1)%4;
            n--;
        }
        return ans+temp;
    }
}   
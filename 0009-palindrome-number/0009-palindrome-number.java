class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int palindrom=0;
        if(x<0){
            return false;
        }
        while(x>0){
            palindrom=palindrom*10+x%10;
            x/=10;
        }
        if(temp==palindrom)
            return true;
        else
            return false;
         
    }
}
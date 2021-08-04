class Solution {
    int isPlaindrome(String S) {
        int j=S.length()-1;
        int i=0;
        int flag=1;
        while(i<j){
            if(S.charAt(i) == S.charAt(j)){
                i++;
                j--;
            }
            else{
                flag=0;
                break;
            }
        }
        return flag;
    }
};

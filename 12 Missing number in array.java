class Solution {
    int MissingNumber(int array[], int n) {
        int xor1=0;
        for(int i=0;i<n-1;i++){
            xor1^=array[i];
        }
        for(int i=1;i<=n;i++){
            xor1^=i;
        }
        return xor1;
    }
}

class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        long sum=0;
        long leftsum=0;
        long rightsum=0;
        for(long i:arr){
            sum+=i;
        }
        for(int i=0;i<n;i++){
            leftsum+=arr[i];
            rightsum=sum-leftsum+arr[i];
            if(leftsum==rightsum)
                return i+1;
        }
        return -1;
    }
}

/*
public static int equilibriumPoint(long arr[], int n) {
        long sum=0;
        long leftrightsum=0;
        for(long i:arr){
            sum+=i;
        }
        for(int i=0;i<n;i++){
            if(leftrightsum==(sum-arr[i])*0.5) return i+1;
            if(leftrightsum>(sum-arr[i]*0.5)) return -1;
            leftrightsum+=arr[i];
        }
        return -1;
    } */

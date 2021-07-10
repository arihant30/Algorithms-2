//User function Template for Java

class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void reverse(int arr[],int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    
    static void rotateArr(int arr[], int d, int n)
    {
        reverse(arr,0,n-1);
        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
    }
}

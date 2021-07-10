/*Complete the function below*/

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
    public int findPeakElement(int arr[], int low, int high, int n)
        {
            int mid = low + (high-low)/2;
            if((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || arr[mid] >= arr[mid+1]))
            {
                return mid;
            }
            else{
                if(mid > 0 && arr[mid-1] > arr[mid]){
                    return findPeakElement(arr, low, mid-1, n);
                }
                else{
                    return findPeakElement(arr, mid+1, high, n);
                }
            }
        }
        int peakElement(int arr[], int n){
            return findPeakElement(arr, 0, n-1, n);
        }
}

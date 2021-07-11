class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> outputarr=new ArrayList<>();
        int leader=arr[n-1];
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=leader){
                leader=arr[i];
                outputarr.add(leader);
            }
        }
        Collections.reverse(outputarr);
        return outputarr;
    }
}

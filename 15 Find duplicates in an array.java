class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> outputarr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int index=arr[i];
            arr[index%n]=arr[index%n]+n;
            
        }
        for(int i=0;i<n;i++){
            arr[i]/=n;
            if(arr[i]>1){
                outputarr.add(i);
            }
        }
        if(outputarr.isEmpty()){
            outputarr.add(-1);
        }
        return outputarr;
    }
}

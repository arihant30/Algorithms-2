class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int low=0;
        int high=0;
        int sum=arr[0];
        ArrayList<Integer> output=new ArrayList<>();
        while((low<n)&&(high<n)){
            if(sum==s){
                output.add(low+1);
                output.add(high+1);
                return output;
            }
            else if(sum<s){
                high++;
                if(high<n)
                    sum+=arr[high];
            }
            else if(sum>s){
                sum-=arr[low];
                low++;
            }
        }
        ArrayList<Integer> newoutput=new ArrayList<>();
        newoutput.add(-1);
        return newoutput;
    }
}

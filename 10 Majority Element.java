class Solution
{
    static int majorityElement(int a[], int size)
    {
        int count=1;
        int maj_index=0;
        for(int i=1;i<size;i++){
            if(a[maj_index]==a[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                maj_index=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<size;i++){
            if(a[i]==a[maj_index]){
                count++;
            }
        }
        return (count>size/2) ? a[maj_index] : -1;
    }
}

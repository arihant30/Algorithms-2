class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        int arr[]=new int[256];
        for(int i=0;i<a.length();i++){
            ++arr[a.charAt(i)];
        }
        for(int i=0;i<b.length();i++){
            --arr[b.charAt(i)];
        }
        for(int i=0;i<256;i++){
            if(arr[i]!=0) return false;
        }
        return true;
        
    }
}

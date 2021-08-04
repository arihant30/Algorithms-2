class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String st[]=S.split("\\.");
        String ans="";
        for(int i=st.length-1;i>=0;i--){
            if(i!=0) ans+=st[i]+".";
            else ans+=st[i];
        }
        return ans;
    }
}

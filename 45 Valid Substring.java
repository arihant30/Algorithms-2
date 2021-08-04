class Solution {
    static int findMaxLen(String S) {
        int maxans=0;
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    maxans=Math.max(maxans,i-stack.peek());
                }
            }
        }
        return maxans;
    }
};

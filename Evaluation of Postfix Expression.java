class Solution
{
    public static int evaluatePostFix(String S)
    {
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int b = s.pop();
                int a = s.pop();
                switch(ch){
                    case '+':
                        s.push(a + b); break;
                    case '-':
                        s.push(a - b); break;
                    case '*':
                        s.push(a * b); break;
                    case '/':
                        s.push(a / b); break;
                }
            }else{
                s.push(ch - '0');
            }
        }
        return s.pop();
    }
}
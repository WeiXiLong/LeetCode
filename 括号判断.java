import java.util.*;
public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        if(A == null || A.length() % 2 != 0){
            return false;
        }
        char ch = A.charAt(0);
        if(ch == ')'){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        stack.push(ch);
        
      
            for(int i = 1; i < n; ++i){
                if(stack.empty() && A.charAt(i) == ')'){
                    return false;
                }
                if(A.charAt(i) == '('){
                    stack.push(A.charAt(i));
                }else if (A.charAt(i) == ')' && stack.peek() == '('){
                    continue;
                }else{
                    return false;
                }
            }
       return true;
        
    }
}
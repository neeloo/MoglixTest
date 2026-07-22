package org.example;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {


        //String s = "(()";    ///output =2
        String s =  ")()())";  /// output =4;
        System.out.println(longestValidParentheses(s));

    }
    public  static int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    int currLength = i-st.peek();
                    maxLength = Math.max(maxLength, currLength);
                }
            }
        }
        return maxLength;
    }
    /// TC = O(n)
    /// SC = O(n)
}

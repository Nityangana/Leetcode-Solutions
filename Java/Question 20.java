class Solution {
    public boolean isValid(String s) {
        char[] c = s.toCharArray();
        Stack <Character> stack = new Stack();
        for (int i = 0; i < c.length; i++) {
            if (c[i]=='(') {
                stack.push(c[i]);
            }
            else if (c[i]== ')' && !stack.isEmpty() && stack.peek()=='(' ) {
                stack.pop();
            }
            else if (c[i]=='{'){
                stack.push(c[i]);
            }
            else if (c[i]=='}' && !stack.isEmpty() && stack.peek()=='{') {
                stack.pop();
            }
            else if (c[i]=='[') {
                stack.push(c[i]);
            }
            else if (c[i]==']'&& !stack.isEmpty() && stack.peek()=='[') {
                stack.pop();
            }
            else {
                stack.push(c[i]);
                break;
            }

        }
        return stack.empty();
    }
}


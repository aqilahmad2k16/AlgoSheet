import java.util.Stack;

public class TextEditor1 {
    public static void writeOperation(Stack<Character> st, char ch) { // adding value to st
        st.push(ch);
    }

    public static void readOperation(Stack<Character> st){
        Stack<Character> nst = new Stack<>();
        while(!st.empty()){
            nst.push(st.pop());
        }

        while(!nst.empty()){
            char ch = nst.pop();     // store value of nst into a variable
            System.out.print(ch);
            st.push(ch);            // we are adding back to origin stack
        }
        System.out.println();
    }

    public static void undoOperation(Stack<Character> st, Stack<Character> rst){
        if(st.empty()) {
            System.out.print("stack is underflow");
            return;
        }

        char ch = st.pop();
        System.out.println(ch);
        rst.push(ch);
    }

    public static void redoOperation(Stack<Character> st, Stack<Character> rst){
        if(rst.empty()){ 
            System.out.print("stack is underflow");
            return;
        }
        st.push(rst.pop());
    }
    public static void main(String[] args) {
        String [] inputs = {"write a", "write b", "write c","read", "read", "undo", "undo","redo","redo", "read"};
        Stack<Character> st = new Stack<>();
        Stack<Character> rst = new Stack<>();
        for(String input:inputs){
            if(input.startsWith("write")){
                writeOperation(st, input.charAt(6));
            }
            else if(input.startsWith("read")){
                readOperation(st);
            }
            else if(input.startsWith("undo")){
                undoOperation(st, rst);
            }
            else {
                redoOperation(st, rst);
            }
        }
    }
}

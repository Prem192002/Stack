public class Array_implementation {

    private static class Stack {
        int[] arr = new int[5];
        int idx = 0;
        
        public void push(int num) {
            if (idx < arr.length) {
                arr[idx] = num;
                idx++;
            } else {
                System.out.println("Stack Overflow");
            }
        }
        
        public int pop() {
            if (idx > 0) {
                int top = arr[idx - 1];
                arr[idx - 1] = 0; // Optional: Clear the popped value
                idx--;
                return top;
            } else {
                System.out.println("Stack Underflow");
                return -1; // Return a sentinel value indicating the stack is empty
            }
        }
        
        public int peek() {
            if (idx > 0) {
                return arr[idx - 1];
            } else {
                System.out.println("Stack is empty");
                return -1; // Return a sentinel value indicating the stack is empty
            }
        }
        
        public void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    
    
    
    
    
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(25);
        st.display();

        st.pop();
        st.display();
    }
}


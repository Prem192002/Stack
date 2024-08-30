import java.util.*;
public class trial {
    public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    for(int i=0;i<size;i++){
        st.push(sc.nextInt());
    }

    int[] arr = new int[st.size()];

    for(int i=arr.length-1;i>=0;i--){
        arr[i]=st.pop();
    }
    int i=arr.length;
    while(st.size()!=arr.length){
        st.push(arr[i-1]);
        i--;

    }
    System.out.println(st);
    
    }
}

import java.util.*;
public class trial {
    public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    for(int i=0;i<size;i++){
        st.push(sc.nextInt());
    }

    Stack<Integer> rt = new Stack<>();
    while(st.size()!=0){
        rt.push(st.pop());
    }

    System.out.println(st);
    System.out.println(rt);
    
    }
}

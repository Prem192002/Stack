public class Array_implementation{
    
    public static void main(String[] args){
        stack st = new stack();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        st.push(10);
        st.display();

        System.out.println();

        st.pop();
        st.display();
    }
}

class stack{
    int[] arr = new int[5];
    int idx = 0;
    //[2,4,6,8,10,12,14,16,18,20]
    public void push(int num){
        if(idx>=arr.length){
            System.out.println("stack overflow");
            return;
        }
        else{
        arr[idx]=num;
        idx++;
        }
    }

    public int pop(){
        if(idx>0){
        int temp=arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return temp;
        }
        else{
            System.out.println("stack underflow");
            return -1;
        }
    }

    public int peek(){
        return arr[idx-1];
    }

    public void display(){
        for(int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

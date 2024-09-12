public class Sliding_window {
    public static void main(String[] args) {
        // [ 2,4,9,1,3,5,8,6,9]
        int[] arr = {2,4,9,1,3,5,8,6,9};
        int k=3;
        int[] res = new int[arr.length-k+1]; //7 
        int idx=0;
        int st=0;
        for(int j=st;j<arr.length-k+1;j++){
            int end=st+k-1;
            int max=arr[st];
            for(int i=st;i<=end;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            res[idx]=max;
            st++;
            idx++;
        }

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}

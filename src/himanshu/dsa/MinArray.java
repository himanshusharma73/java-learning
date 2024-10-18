public class MinArray {
    public static void main(String[] args) {
        int[] arr={55,1,544,25,4,2};
        System.out.println(minimum(arr));
    }

    static int minimum(int[] in){
        int ans =in[0];
        for (int i = 0; i < in.length; i++) {
            if(in[i]<ans){
               ans=in[i];
            }
           
            
        }
        return ans;

    }
}

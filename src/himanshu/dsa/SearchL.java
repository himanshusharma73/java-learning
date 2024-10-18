public class SearchL {
    public static void main(String[] args) {
        int[] in={5,8,10,9,0,4};
        int target=48;
        System.out.println(Lsearch(in, target));
        

    }

    static int Lsearch(int[] arr,int tar){
        for(int i=0;i<arr.length;i++){
            if(tar==arr[i]){
                return i;
            }
        }
        return -1;

    }
}

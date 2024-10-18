public class Unique {
    public static void main(String[] args) {
        int [] arr={2,3,2,4,3,4,6};
        System.out.println(unique(arr));
    }

    static int unique(int[] arr){
        int unique=0;
        for(int no:arr){
            unique^=no;
        }
        return unique;
    }
}

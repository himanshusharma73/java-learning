public class Wealth {
    public static void main(String[] args) {
        int[][]  arr={
                    {4,5,7},        //16
                    {9,4,4},//17
                    {4,2,1,5}//12
        };
       System.out.println(sum(arr));
    }
    static int sum(int[][] arr){
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum=sum+arr[i][j];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}

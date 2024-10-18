public class Searchin2dArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},
                    {5,6,7},
                    {8,9}};
        int tar=8;
        int[] ans=search(arr, tar);
        System.out.println("the target found at Row "+(ans[0]+1)+" and coloumn "+(ans[1]+1));
    }
    static int[] search(int[][] arr,int tar){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==tar){
                    return (new int[]{i,j});
                }
            }
        }
        return new int[] {-1,-1};
    }
}

package himanshu.dsa;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums={1,2,2};
        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums) {
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j =0+i; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    i++;
                    j++;
                    k++;
                }
            }
        }
        return k;
    }
}

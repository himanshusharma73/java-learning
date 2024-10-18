import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,4};
        System.out.println(sum3(nums));
    }

    static List<List<Integer>> sum3(int[] nums){
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int j2 =j+1 ; j2 < nums.length; j2++) {
                    if((nums[i]+nums[j]+nums[j2])==0){
                       list.add(Arrays.asList(nums[i],nums[j],nums[j2]));
                       i++;
                }
            }
        }
       
    }
     return list;
}
}


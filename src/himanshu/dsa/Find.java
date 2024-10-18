package himanshu.dsa;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr={2,4,5,5,6,9,9};
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(findIndex(arr, 9, 0,list));
    }

    
    static ArrayList<Integer> findIndex(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);;
        }
        
        return  findIndex(arr, target, index+1,list);
        
       
    }
}

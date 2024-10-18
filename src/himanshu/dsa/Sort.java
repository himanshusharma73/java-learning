public class Sort {
    static int x;
      public static void printArr1(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    public static void main(String[] args) {
     
        int arr[]={27,19,2,1,5};
        // bubble sort
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=0;j<arr.length-1-i;j++){
    //         if(arr[j]>arr[j+1]){
    //             int temp=arr[j];
    //             arr[j]=arr[j+1];
    //             arr[j+1]=temp;
                
    //             x++;
    //         }
    //     }
       
    // }
    // System.out.println(x);
    //     printArr1(arr);

    // selection sort 

    for(int i=0;i<arr.length-1;i++){
        int smallest=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[smallest]>arr[j]){
                smallest=j;
            }
        }
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
    }
    printArr1(arr);
    }
}

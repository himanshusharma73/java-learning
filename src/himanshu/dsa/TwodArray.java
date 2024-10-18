import java.util.Scanner;

class TwodArray{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of rows ");
    int row=sc.nextInt();
    System.out.println("enter no of column");
    int colmn=sc.nextInt();

    int no [] [] =new int [row][colmn];

    System.out.println("Entre elements of an array");
    for(int i=0;i<row;i++){
        for(int j=0;j<colmn;j++){
            no[i][j]=sc.nextInt();
        }
    }

    System.out.println("Elements of Arrays are ");
    for(int i=0;i<row;i++){
        for(int j=0;j<colmn;j++){
            System.out.print(no[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("ENtre no which you want to find");
    int x=sc.nextInt();
    for(int i=0;i<row;i++){
        for(int j=0;j<colmn;j++){
           if(no[i][j]==x){
            System.out.println("the no is found on the location of " + i+" "+ +j);
           }
        }
       
    }

}
}
import java.util.Scanner;
public class Add{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[4][4];
        System.out.println("Enter the elements of array 4x4:");
        for(int i=0;i<= arr.length-1;i++) {
            for(int j=0;j<=arr.length-1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
//        Left-To-Right & Up-TO-Down
        System.out.println("Left-To-Right & Up-TO-Down");
        for (int i=0;i<= arr.length-1;i++){
            for (int j=0;j<=arr.length-1;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("\n");
//        Right-To-Left
        System.out.println("Right-To-Left");
        for (int i=0;i<= arr.length-1;i++){
            for (int j= arr.length-1;j>=0;j--){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n");
//        Down-TO-Up
        System.out.println("Down-TO-Up");
        for(int i=arr.length-1;i>=0;i--){
            for (int j=0;j<=arr.length-1;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("\n");
//        Reverse
        System.out.println("Reverse");
        for (int i=arr.length-1;i>=0;i--){
            for (int j=arr.length-1;j>=0;j--){
                System.out.print(" "+arr[i][j]);
            }
            System.out.print("\n");
        }
    }
}

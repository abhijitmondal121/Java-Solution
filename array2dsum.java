import java.util.Scanner;

public class array2dsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range : ");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter the  value");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }


        int arr1[][]=new int[n][n];
        System.out.println("Enter the value");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        int sum[][]=new int[n][n];
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum.length;j++){
                sum[i][j]=arr[i][j]+arr1[i][j];
            }
        }



        System.out.println("output : ");
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum.length;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }


    }
}

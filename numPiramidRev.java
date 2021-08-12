import java.util.Scanner;

public class numPiramidRev {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range : ");
        int n=sc.nextInt();
        for (int i=n;i>0;i--){
            int a=1;
            for (int s=0;s<n-i;s++){
                System.out.print(" ");
            }
            for (int j=i;j>0;j--){

                System.out.print(a +" ");
                a++;
            }
            System.out.println();
        }




        for (int i=0;i<n;i++){
            int a=1;
            for (int s=n-i;s>1;s--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }

    }


}

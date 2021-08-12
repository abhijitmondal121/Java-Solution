import java.util.Scanner;

public class starSidePiramid {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<a;i++){
            for(int j=a-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}

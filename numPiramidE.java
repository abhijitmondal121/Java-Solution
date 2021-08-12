import java.util.Scanner;

public class numPiramidE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int a=1;
            for(int j=n-i;j>0;j--){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }


        for (int i=2;i<=n;i++){
            int a=1;
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }

    }
}

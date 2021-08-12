
import java.util.Scanner;

public class starRevL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enbter the number : ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int s=2*(n-i);s>=0;s--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

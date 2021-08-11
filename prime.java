
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int p=0;
        int n=sc.nextInt();
        for (int i=1;i<=n/2;i++){
            if(n%i==0){
                p++;
            }
        }

        if(p==1){
            System.out.println("The number is prime : ");
        }
        else
        System.out.println("The number is not prime : ");
    }
    
}

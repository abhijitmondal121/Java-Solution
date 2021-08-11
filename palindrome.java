
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=0,t=0;
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
         t=n;
        while (n>0){
            int r=n%10;
            s=s*10+r;
            n=n/10;
        }

        if(t==s){
            System.out.println("the number is palindrom");
        }
        else
            System.out.println("the number is not palindrom");
    }
}

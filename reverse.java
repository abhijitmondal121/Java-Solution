
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int reverse=0;
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        while (n!=0){
            int r=n%10;
            reverse=reverse*10+r;
            n=n/10;
        }
        System.out.println(reverse);
    }
}

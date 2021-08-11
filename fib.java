import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range : " );
        int n=sc.nextInt();
        int a=0,b=1,temp=0;
        System.out.print(a+" ");
        for (int i=1;i<=n;i++){

            a=b;
            b=temp;
            temp=a+b;
            System.out.print(b+" ");
        }
    }
}

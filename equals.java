
import java.util.Scanner;

public class equals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st string : ");
        String a=sc.next();
        System.out.println("Enter the 2nd string : ");
        String b=sc.next();
        if(a.equals(b)){
            System.out.println("The String is same : ");
        }
        else {
            System.out.println("The String is not same : ");
        }
    }
}

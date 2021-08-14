
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        System.out.println("Enter the range : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the number : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the number you want to search : ");
        int target=sc.nextInt();

        for (int i=0;i<a.length;i++){
            if(a[i]== target){
               c++;
            }

        }


        if(c==1){
            System.out.println("The number found in the array : ");
        }
        else {
            System.out.println("The number not  found in the array : ");
        }

    }
}

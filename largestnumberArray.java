
import java.util.Scanner;

public class largestnumberArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=0;
        System.out.println("Enter the renge : ");
        int n=sc.nextInt();
        System.out.println("Enter the value :");
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("large : "+ temp);
    }
}

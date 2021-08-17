import java.util.Scanner;

public class stringPalindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String : ");
        String string = sc.next();
        String reversedStr = "";

        for(int i = string.length()-1; i >= 0; i--){
            reversedStr = reversedStr + string.charAt(i);
        }

        if(reversedStr.equals(string)){
            System.out.println("The string is palindrom : ");
        }
        else{
            System.out.println("The string is not palindrom : ");
        }

    }
}

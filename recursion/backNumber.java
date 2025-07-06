import java.util.Scanner;
public class backNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number:");
            int n= sc.nextInt();
            num(n);
        }
    }
    public static void num(int n) {
        if(n==0) return;
        System.out.println(n);
        num (n-1);
    }   
}
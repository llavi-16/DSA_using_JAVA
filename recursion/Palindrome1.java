public class Palindrome1{
    static int dig = 0;
    public static void rev(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        dig = dig * 10 + rem;
        rev(n/10);
    }
    public static boolean pal(int n){
        dig =0;
        rev(n);
        return dig == n;

    }
    public static void main(String[] args){
        //rev(45698);
        System.out.println(pal(12321));

    }
}
public class Factorial{
    public static void main(String[] args){
        System.out.println(fac(3));
    }
    public static int fac(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fac(n-1);

    }
}
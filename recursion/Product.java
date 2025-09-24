public class Product{
    public static void main(String[] args){
        int n = 234;
        System.out.println(pro(n));
    }
    public static int pro(int n){
        if(n%10==n){
            return n;
        }
        return n%10 * pro(n/10);
    }
}
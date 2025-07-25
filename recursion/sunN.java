public class sunN {
    public static void main(String[] args) {
        int n =5;
        System.out.println(num(n));
    }
    public static int num(int n){
        if (n==0) return 0;
        return n +num(n-1);
        
    }
    
}

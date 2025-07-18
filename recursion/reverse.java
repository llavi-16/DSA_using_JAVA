public class reverse{
    public static void main(String[] args){
        System.out.println(rev(1234));

    }
    public static int rev(int n){
        if(n==0){
            return 0;

        }
        return n%10+rev(n/10)*10;
    }
}
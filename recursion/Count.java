public class Count{
    public static void main(String[] args){
        System.out.println(count(10020, 0));

    }
    public static int count(int n,int c){
        if(n==0){
            return c;
        }
        if(n%10==0){
            return count(n/10, c+1);
        } else {
            return count(n/10, c);
        }

    }
}
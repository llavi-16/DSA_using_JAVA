public class Number{
    public static void main(String[] args){
        num(1);
        
    }
    public static void num(int n){
        if(n>10){
            return;
        }
        System.out.println(n);
        num(n+1);

        
    }
}
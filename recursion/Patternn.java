public class Patternn{
    public static void main(String[] args){
        helper(5,0);
    }
    public static void helper(int r , int c){
        if(r==0){
            return;
        }
        if(c<r){
            helper(r, c +1);
            System.out.print("* ");
            
        } else {
            helper(r - 1, 0);
            System.out.println();
            
        }
    }
}
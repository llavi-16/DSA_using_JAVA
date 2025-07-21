public class Pattern1{
    public static void main(String[] args){
        helper(5,0);
    }
    public static void helper(int r , int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            helper(r, c + 1);
        } else {
            System.out.println();
            helper(r - 1, 0);
        }
    }
}
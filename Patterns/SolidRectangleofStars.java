public class SolidRectangleofStars{
    public static void main(String[] args){
        pattern(4);

    }
    public static void pattern(int n){
        for(int i =1; i<=n;i++){
            for(int j =0;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class InvertedRightAngledTriangleofStars{
    public static void main(String[] args){
        pattern(4);

    }
    public static void pattern(int n){
        for(int i =n; i>=1;i--){
            for(int j =0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
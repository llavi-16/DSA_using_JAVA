public class InvertedRightAngledTriangleofNumbers{
    public static void main(String[] args){
        pattern(4);

    }
    public static void pattern(int n){
        for(int i =n;i>0;i--){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
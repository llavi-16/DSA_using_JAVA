public class Search{
    public static boolean sea(int[] arr, int in, int tar){
        if(in == arr.length){
            return false;
        }
        return (arr[in] == tar || sea(arr,in+1,tar));
    }
    public static void main(String[] args){
        int[] arr = {4,6,8,3,9,2,54};
        System.out.println(sea(arr,0,2));

    }
}
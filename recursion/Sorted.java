public class Sorted{
    public static boolean sort(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sort(arr,index+1);
    }
    public static void main(String[] args){
        int[] arr = {1,3,5,6,8,58};
        System.out.println(sort(arr,0));

    }
}
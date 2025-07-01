import java.util.Arrays;
public class Selection2 {
    public static void main(String[] args){
        int[] arr = {-10, 0, 330, 226, 50};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr){
        for(int i =0; i<arr.length;i++){
            int last = arr.length-1-i;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);

        }

    }
    public static int getMaxIndex(int[] arr,int start, int last){
        int max = start;
        for(int i = start;i<=last;i++){
            if(arr[i]>
            arr[max]){
                max = i;
            }
        }
        return max;
    }


    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    
    
}

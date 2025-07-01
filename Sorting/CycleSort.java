import java.util.Arrays;
public class CycleSort{
    public static void main(String[] args){
        int[] arr= {2,5,3,1,4};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cycle(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);

            }else{
                i++;
            }
        }
    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
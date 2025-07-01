import java.util.Arrays;
public class Selection {
    public static void main(String[] args) {
        int[] arr = {10, 405, 30, 640, 50,};
        selection(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void selection(int[] arr){
        for(int i =0;i<arr.length-1;i++){
        int max =i;
        for(int j =i+1; j<arr.length;j++){
            if(arr[max]>arr[j]){
                max=j;
            }   
        }
        swap(arr, max, i);
    }
        
    }


    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start]= arr[end];
        arr[end]=temp;

    }
        
    
}
    


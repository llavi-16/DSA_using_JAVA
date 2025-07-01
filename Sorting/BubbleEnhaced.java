import java.util.Arrays;
public class BubbleEnhaced{
    public static void main(String[] args){
        int[] arr = {5, 2, 6,0,69, 1, 5, -6};
        int[] rel = bubblesort(arr);
        System.out.println(Arrays.toString(rel));

    }
    public static int[] bubblesort(int[] arr){
        boolean swapped;
        for(int i =0; i<arr.length-1;i++){
            swapped =false;
            for(int j =1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp =arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped = true;
                }
            }
            if(swapped == false){
            break;
            }
    }
        return arr;
    }
    
}
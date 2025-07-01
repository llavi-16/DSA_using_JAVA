public class Insertion {
    public static void main(String[] args) {
        int[] arr = {0, 430, -30, 60, 50};
        insertion(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }


// 🔁 Outer loop: i = 0 to arr.length - 2
// This picks elements one by one from left to right to insert in correct position.
// 🔁 Inner loop: j = i + 1 to j > 0
// This moves the selected element leftwards as long as it's smaller than the element before it.
// It inserts the element in its sorted position by swapping backward.
    public static void insertion(int[] arr){
        for(int i =0; i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if (arr[j]<arr[j-1]) {
                    swap(arr,j,j-1);
                    
                }else{
                    break;
                }
            }
        }
    }
    public static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]=temp;
    }
    
}

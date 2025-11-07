import java.util.*;
class FindUnion{
    public static void UnionFin(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        int count =0;
        for(int i=0; i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i =0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        for(int n:set){
            System.out.println(n);
            count++;
        }
        System.out.println("count : " +count);
    }
    public static void main(String[] args){
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,9,3,2,9,4};
        UnionFin(arr1,arr2);
    }
}
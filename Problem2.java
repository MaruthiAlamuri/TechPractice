import java.util.*;
public class Problem2 {
    public static int findLargeSmallDifference(int[] arr,int n){
       Arrays.sort(arr);

       return arr[n-1]-arr[0];
    }
    public static void main(String[] args) {
        int[] array = {10,11,7,12,14};
        int n = array.length;
        System.out.println(findLargeSmallDifference(array, n));
    }
}

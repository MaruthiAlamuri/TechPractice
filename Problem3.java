public class Problem3 {
    public static int findTotalDistance(int[] array,int n){
       int totalDistance = 0;
       for(int i=0;i<n-1;i++){
           int difference = array[i]-array[i+1];
           if(difference < 0){
             difference = -difference;
           }
           totalDistance += difference;
       }
    
        return totalDistance;
    }
    
    public static void main(String[] args){
        int[] array = {10,11,7,12,14};
        int n = array.length;
        System.out.println(findTotalDistance(array, n));

    }
}

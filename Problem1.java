import java.util.Scanner;

public class Problem1{

    public static int findOddEvenDifference(int[] arr ,int n){
         int even = 0, odd = 0;
         for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){ 
                even += arr[i];   
            } else {             
                odd += arr[i];    
                
            }
         }

        return odd-even; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int n = sc.nextInt();
        System.out.println();
        int[] array = new int[5];
        for(int i=0;i<array.length;i++){
            System.out.print("Add Element into array " + i + ": ");

            array[i]=sc.nextInt();
        }
        System.out.println(findOddEvenDifference(array,n)); 
        sc.close();
    }
    
}

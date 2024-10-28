import java.util.*;
public class Solution
{
	
	public static int[] removeDuplcates(int[] array){ // 1,2,1,2,3
	    int[] uniqueArray = new int[array.length]; // 1,2,0,0
	    int index = 0; //2
	    for(int i=0;i<array.length;i++){
	        boolean foundDuplicate = false;
	        
	        for(int j=0;j<index;j++){ //j=0,1,2
	            if(array[i] == uniqueArray[j]){ //1 == 1
	               foundDuplicate = true;
	               break;
	            }
	        }
	        if(!foundDuplicate){
	            uniqueArray[index] = array[i];
	            index++;
	        }
	    }
	    int[] result = new int[index];
	    for(int i =0;i<result.length;i++){
	        result[i]=uniqueArray[i];
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,1,2,3};
		int[] result = removeDuplcates(array);
		System.out.println(Arrays.toString(result));
	}
}

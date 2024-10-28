public class Test
{
	
	public static void sumOfEachElement(int[] nums){
	     
	     int count =0,sum = 0;
	     for(int j =0;j<nums.length;j++){
	    int temp=nums[j];
	     while(temp > 0){
	         count++;
	         temp/=10;
	     }
	     while(count > 1){
	         for(int i=0;i<count;i++){
	            sum += nums[j]%10;
	            nums[j]/=10;
	         }
	         nums[j] = sum;
	         count=0;
	         while(sum > 0){
	             count++;
	             sum/=10;
	         }
	     }
	     System.out.println(nums[j]);
	     }
	     
	}
	
	public static void main(String[] args) {
	    int[] nums = {15,20,88,99};
	    sumOfEachElement(nums);
	}
}

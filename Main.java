import java.util.*;
public class Main
{
	
	public static void removeLargeName(String[] names){
	     int highestNameLength = 0;
	     int count = 0;
	    for(int i = 0; i < names.length;i++){
	        if(names[i].length() > highestNameLength){
	            highestNameLength = names[i].length();
	            count++;
	        }
	    }
	    String[] result = new String[names.length-count];
	    int j = 0;
	    for(int i=0;i<names.length;i++){
	        if(names[i].length() != highestNameLength){
	            result[j++] = names[i];
	        }
	    }
	    
	    System.out.println(Arrays.toString(result));
	    
	}
	     
	public static void main(String[] args) {
	     String[] names = {"Ram","maruthi","puji","saru", "magsasg"};
	     removeLargeName(names);
	     
	}
}


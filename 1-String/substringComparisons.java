~~~~~~~~~~~~~~~~~~~~~~~~~~ Substring Comparisons
public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";
      
    for(int i = 0; i <= s.length() - k; i++){
    	   
      	String newStr = s.substring(i, i+k);
      	if(newStr.compareTo(smallest) < 0 || smallest.isEmpty()){
        	smallest = newStr;
      	}
      	if(newStr.compareTo(largest) > 0 || largest.isEmpty()){
        	largest = newStr;
      	}
       
    }

    String ans = smallest + "\n" + largest;
    return ans;  
}
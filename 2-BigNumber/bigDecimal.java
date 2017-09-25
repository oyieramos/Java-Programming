~~~~~~~~~~~~~~~~~~~~~~~~~~ BigNumber -> BigDecimal
import java.math.BigDecimal;
import java.util.*;

class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

      	//Sorting
		for (int i = 0; i < (n - 1); i++){
		    for (int j = (i+1); j < n; j++){
		        if(new BigDecimal(s[i]).compareTo(new BigDecimal(s[j])) < 0 ){
		            String temp = s[i];
		            s[i] = s[j];
		            s[j] = temp;
		        }
		    }
		}

		//Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
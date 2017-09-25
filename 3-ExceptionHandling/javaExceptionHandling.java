~~~~~~~~~~~~~~~~~~~~~~~~~~ Exception Handling
power : {
    function (long n, long p){
      if(n < 0 || p < 0){
        System.out.println("n or p should not be negative.");
      } else if(n == 0 || p == 0 ) {
        System.out.println("n or p should not be zero.");
      } else {
        long ans = 1;
        for(int i = 0; i <= p; i++){
          ans *= n;
        }
        return ans;
      }
    }
  }
~~~~~~~~~~~~~~~~~~~~~~~~~~ Exception Handling
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    if either n or p is negative "n or p should not be negative."
    n ^ p
    */
    public int power(long n, long p) throws Exception{
      
      if(n<0 || p<0){
        throw new Exception("n or p should not be negative.");
      } else if (n==0 && p==0){
        throw new Exception("n and p should not be zero.");
      }
      return (int) Math.pow(n,p);
      
    }
    
}
~~~~~~~~~~~~~~~~~~~~~~~~~~ Exception Handling

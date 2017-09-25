~~~~~~~~~~~~~~~~~~~~~~~~~~ Anagrams
static boolean isAnagram(String a, String b) {
        // Complete the function
        //should return True or False
      a = a.toLowerCase();
      b = b.toLowerCase();
      
      char []aa = a.toCharArray();
      char []bb = b.toCharArray();
      
      Arrays.sort(aa);
      Arrays.sort(bb);
      
      String A = new String(aa);
      String B = new String(bb);
      // A == B will return false
      if(A.equals(B)){
        return true;
      } else {
        return false;
      }
      
    }
/* 
fucking .join() method is so difficult to use
string.toLowerCase()
char []array = string.toCharArray()
Arrays.sort(array)
String A = new String(array)
*/
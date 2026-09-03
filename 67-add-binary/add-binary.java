import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger copya =BigInteger.ZERO;
        BigInteger copyb = BigInteger.ZERO;
        int m = 0;
        int n = 0;
        for(int i = a.length()-1 ; i>=0 ; i--){
            if(a.charAt(i)=='1'){
            BigInteger powerVal = BigInteger.valueOf(2).pow(a.length()-i-1);
               copya = copya.add(powerVal);
            } 
        }
        for(int i = b.length()-1 ; i>=0 ; i--){
            if(b.charAt(i)=='1'){
                BigInteger powerVal = BigInteger.valueOf(2).pow(b.length()-i-1);
                copyb = copyb.add(powerVal);
               
            }
        }
      BigInteger result = copya.add(copyb);
      String ans = "";

      if(result.equals(BigInteger.ZERO)){
        return "0";
      }
      
      while(result.compareTo(BigInteger.ZERO)>0){
        int remainder = result.mod(BigInteger.valueOf(2)).intValue();
        ans = (char)(remainder + '0')+ans;
        result = result.divide(BigInteger.valueOf(2));
      }
       return ans; 
    }
}
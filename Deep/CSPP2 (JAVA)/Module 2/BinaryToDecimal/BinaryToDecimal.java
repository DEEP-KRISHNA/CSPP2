/**
 * Given a binary string that contains a sequence of 1's and 0's, returns an
 * equivalent to the decimal value in integer form.
 * 
 * Input : 1010
 * Output : 10
 * 
 * Input : 000000000000001010
 * Output : 10
 * 
 * @author Siva Sankar
 * @author sandeep kolli
 */

public class BinaryToDecimal {

    /**
     * This method reads in a Binary String and returns the equivalent to the
     * decimal value of the binary string.
     * @param s, the binary string that contains only sequence of 1's and 0's.
     * @return the decimal number n of the binary string.
     */
    public static int binaryToDecimal (String s) 
    {
        int res=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                res += Math.pow(2, s.length()-i-1);
            }
        }
        return res;
    }
}
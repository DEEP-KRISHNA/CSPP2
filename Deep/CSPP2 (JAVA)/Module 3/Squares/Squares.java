/**
 * Given an array of Integers, return an array of the square
 * of each values in the array. 
 * 
 * Input : {1, 2, 3}
 * Output : {1, 4, 9}
 * 
 * @author Siva Sankar
 * @author Mayank
 * @author Sandeep Kolli
 */

public class Squares {

    /**
     * This method returns the array of ints that are squares of each element
     * in the input array.
     * 
     * @param nums, the input array.
     * 
     * @return the array of ints that are squares of each element
     * in the input array.
     * 
     */
    public static int[] squared(int[] nums) {
        //  Your code goes here.
        int [] squareNums = new int[nums.length]; //squareNums is the new array in which all the squared values get stored
            for (int i=0;i<nums.length;i++){
                squareNums[i]=(int)Math.pow((double)nums[i], 2.0);
            }

        return squareNums;
    }
}
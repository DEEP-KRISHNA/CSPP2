/**
 * Given an array of integers Find the mean, median, mode, standard deviation
 * and variance.
 * 
 * Mean
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Median
 * Input : [1,2,3,4,5]
 * Output : 3.0
 * 
 * Mode
 * Input : [1,1,2,2,3]
 * Output : [1,2]
 * 
 * Variance
 * Input : [1,2,3,4,5]
 * Output : 2.0
 * 
 * Standard Deviation
 * Input : [1,2,3,4,5]
 * Output : 1.41421356
 * 
 * @author Sandeep Kolli
 */

import java.util.*;

public class Stats {

    /**
     * This method should return the mean of the elements of the array.
     * If the arr is empty (length is 0), return the mean as 0.
     * @param arr, the input array contians elements.
     * @return the mean of the array.
     */
    public static double mean(int[] arr) {
        //  Your code goes here....
        if(arr.length==0) return 0;
        else{
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        double Length=arr.length;
        return (sum/Length);
        }
    }

    /**
     * This method returns the median of the elements of the array.
     * Prerequisite : The array should be sorted to find the median.
     * 
     * Hint : Arrays.sort(arr) sorts the elements of the array.
     * 
     * @param arr, the input array contains random elements (not in sorted order)
     * @return the median of the elements of the array.
     */
    public static double median(int[] arr) {
        //  Your code goes here...
        int middle = arr.length/2;
        if (arr.length%2 == 1) {
            return (double) arr[middle];
        } else {
            if((middle%2 == 1) && (arr.length>2)) return (arr[middle+1] + arr[middle]) / 2.0;
            else return (arr[middle-1] + arr[middle]) / 2.0;
        }
    }

    /**
     * This method returns the mode of the array. If there is no mode, then it returns
     * 0 as the mode.
     * 
     * @param arr, the input array.
     * @return the mode of the array, 0 otherwise if there is no mode.
     */
    public static int mode(int[] arr) {
        //  Your code goes here....
        int m=1;
        int modeVal=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]) count=count+1;
            }
            if(count>m){
                m=count;
                modeVal=arr[i];
            } 
        }

        if(m==1) return 0;
        else return modeVal;
    }

    /**
     * This method returns the variance of the input array.
     * Make use of the mean functon which has already written.
     * 
     * @param arr, the input array
     * @return the variance of the array.
     */
    public static double variance(int[] arr) {
        //  Your code goes here....
        double meanVal=mean(arr);
        double meanArrSquare = 0; 
        for(int i=0;i<arr.length;i++){
            meanArrSquare = meanArrSquare + Math.pow((double)arr[i]-meanVal, 2);
        }
        return meanArrSquare/(double)arr.length;
    }

    /**
     * This method returns the standard deviation of the array.
     * Hint : You can find the square root using Math.sqrt() method.
     * @param arr, the input array
     * @return the standard deviation of the input array.
     */
    public static double standardDeviation(int[] arr) {
        //  Your code goes here....
        return Math.sqrt(variance(arr));
    }
}
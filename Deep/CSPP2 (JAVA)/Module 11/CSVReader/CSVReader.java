
/**
 * @author Sandeep Kolli
 */

/**
 * Given a CSV file, we will read the data from the CSV file and parses each
 * line of the file. See the operations that are performed after reading the
 * file.
 * 
 * @author Siva Sankar
 * @author Nemnous
 */

import java.util.Arrays;

public class CSVReader {
    String[] dataFrame;

    /**
     * This function is used to read the given csv File This uses functions from the
     * ReadCSVFile class
     * 
     * @param fileName - name of the given csv file
     */
    public void readCSV(String fileName) {
        dataFrame = ReadCSVFile.readFile(fileName);
    }

    /**
     * The number of rows in the given data frame. Note: This shouldn't include 
     * the coloumn labels.
     * 
     * @return -1 if the Data set is empty
     */
    public int rowCount() {
        // TODO
        // Your code goes here....
        return (dataFrame.length)-1;
    }

    /**
     * This method returns the count of coloumns in a data Frame.
     * @return the count of columns in the dataset and -1 otherwise.
     */
    public int fieldCount() {
        // TODO
        // Your code goes here....
        if(dataFrame.length != 0) return dataFrame[0].split(",").length;
        else return -1;
    }

    /**
     * This method returns the name of the column based on the index 
     * passed as a parameter
     * 
     * @param index index of the coloumn starting from 1.
     * @return the column name based on the index and null otherwise.
     */
    public String getFieldName(int index) {
        // TODO
        // Your code goes here....
        if(dataFrame.length != 0 && index>=1) return dataFrame[0].split(",")[index-1];
        else return null;
    }


    /**
     * This method returns the row (array of values) based on the parameter 
     * passed to the method.
     * 
     * @param rowNumber given the Row of the row indexing from 1. Exclude the column
     * header row
     * 
     * @return the string array containing the contents of the entire row.
     */
    public String[] getRow(int rowNumber) {
        // TODO
        // Your code goes here....
        if(dataFrame.length != 0 && rowNumber>=1 && rowNumber<=dataFrame.length) return dataFrame[rowNumber].split(",");
        else return null;
    }

    /**
     * This method returns the rows (String array) based on fromIndex and toIndex.
     * The fromIndex and toIndex should be in the range of the dataset lengths.
     * 
     * @param fromIndex given from index
     * @param toIndex   given to index
     * @return String array containing the rows starting from the fromindex to the
     *         toindex. Append the entire row to the string array comma separated.
     */
    public String[] getRows(int fromIndex, int toIndex) {
        // TODO
        // Your code goes here....
        //return rows;

        if(fromIndex>=0 && toIndex<dataFrame.length && fromIndex<=toIndex){
        int k=fromIndex;
        String [] str = new String[toIndex-fromIndex];
        for(int i=0;i<toIndex-fromIndex;i++){
            str[i]=dataFrame[k];
            k++;
        }
        return str;
    }
    else return null;
    }

    /**
     * This method returns the column values based on particular column index.
     * 
     * @param index index of the column
     * @return all the values of the column as a string array
     */
    public String[] getColumnValues(int index) {
        // TODO
        // Your code goes here....
        if(dataFrame.length != 0){ 
        if(index>=0 && index < dataFrame[0].split(",").length){
        String str[]= new String[dataFrame.length-1];
        for(int i=0;i<dataFrame.length-1;i++){
            str[i]=dataFrame[i+1].split(",")[index];
        }
        return str;
    }
    else return null;
    }
    else return null;
    }
}
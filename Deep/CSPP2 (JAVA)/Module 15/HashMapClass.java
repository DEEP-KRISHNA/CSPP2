import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;

public class HashMapClass {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> hash = new HashMap<String, Integer>();

        FileReader fileReader = new FileReader(
                "C:\\Users\\PINAKA\\Desktop\\JAVA\\Deep\\CSPP2 (JAVA)\\Module 15 - Not Yet Done\\tale.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String hashStr = "";
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            hashStr = hashStr + " " + line;
        }
        bufferedReader.close();

        String hashStrArr[] = hashStr.split(" ");
        int i = 0;
        while (i < hashStrArr.length) {
            if (hashStrArr[i].length() != 0) {
                if (hash.get(hashStrArr[i]) == null) {
                    hash.put(hashStrArr[i], 0);
                } else {
                    hash.put(hashStrArr[i], hash.get(hashStrArr[i]) + 1);
                }
            }
            i++;
        }
        ArrayList<String> hashKeyList = new ArrayList<String>(hash.keySet());
        Collections.sort(hashKeyList);
        for (String x : hashKeyList)
            System.out.println("Key = " + x + ", Value = " + hash.get(x));
    }

}
import java.io.*;
import java.util.*;

final class GuessGameOps {
    /**
     * movies is array of variables.
     */
    private movie[] movies;
    /**
     * size is number of movies.
     */
    private int size;

    GuessGameOps() {
        final int hundred = 100;
        movies = new movie[hundred];
        size = 0;
    }

    /**
     * it will take filepath as argument scrape all the information.
     *
     * @param filepath file
     * @throws Exception throws exception
     */
    public void readFile(final String filepath) throws Exception {
        File file = new File(filepath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        String str = "";

        while ((st = br.readLine()) != null) {
            if (st.length() == 0) {
                str = str + "\n";
            } else {
                str = str + st + "696";
            }
        }
        String[] strarr = str.split("\n");

        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i].length() != 0) {
                String[] str;
                final int t = 3;
                final int tw = 2;
                final int z = 0;
                final int o = 1;
                str = strarr[i].split("696");
                // System.out.println(samplestr.length);
                movies[size] = new movie(str[z], str[o], str[tw], str[t]);
                size++;
            }
        }
    }

    /*
     * displays all the info about all the movies array.
     */
    public void displayAll() {
        for (int i = 0; i < size; i++) {
            System.out.print(movies[i].getMovieName() + "  ");
            System.out.print(movies[i].getLevel() + "  ");
            System.out.print(movies[i].getHint1() + "  ");
            System.out.print(movies[i].getHint2() + "  ");
            System.out.println();
        }
    }

    /*
     * when you select level as 4 this function called.
     */

    public movie randomWord() {
        double d = Math.random();
        return movies[(int) (d * size)];
    }

    /*
     * when you select level as 1 or 2 or 3 this function called.
     */
    public movie randomWord(final int levelS) {
        String levelStr;
        if (levelS == 1) {
            levelStr = "Easy";
        } else if (levelS == 2) {
            levelStr = "Medium";
        } else {
            levelStr = "Hard";
        }
        double d = Math.random();
        if (movies[(int) (d * size)].getLevel().equals(levelStr)) {
            return movies[(int) (d * size)];
        } else {
            return randomWord(levelS);
        }
    }

    /**
     * @param ch ch
     * @return boolean checks whether 'ch' charachter is one among the lowercase
     *         letters or not (a-z) returns the boolean value accordingly
     */
    public boolean condition1(final char ch) {
        final int nineSeven = 97;
        final int oneTwoTwo = 122;
        return ((int) ch >= nineSeven && (int) ch <= oneTwoTwo);
    }

    /**
     * @param ch ch
     * @return boolean checks whether 'ch' charachter is one among the uppercase
     *         letters or not (A-Z) returns the boolean value accordingly
     */
    public boolean condition2(final char ch) {
        final int ninety = 90;
        final int sixFive = 65;
        return ((int) ch >= sixFive && (int) ch <= ninety);
    }

    /**
     * @param m - movie
     * @param s - char
     * @return String it will check for char in movie if its there it returns a
     *         string by keeping that char in appropriate position and remaining
     *         values as '_' if its not there it returns a flag "696NOCOMMON696"
     */
    public String guessedWord(final movie m, final char s) {
        String mov = m.getMovieName().toLowerCase();
        String returnStr = "";
        if (s == '\0') {
            for (int i = 0; i < mov.length(); i++) {
                if (condition1(mov.charAt(i)) || condition2(mov.charAt(i))) {
                    returnStr = returnStr + "_" + " ";
                } else {
                    returnStr = returnStr + mov.charAt(i) + " ";
                }
            }
        } else {
            if (mov.indexOf(s) == -1) {
                returnStr = "696NOCOMMON696";
            } else {
                for (int i = 0; i < mov.length(); i++) {
                    final boolean a1 = condition1(mov.charAt(i));
                    final boolean a2 = condition2(mov.charAt(i));
                    if (a1 || a2) {
                        Character c1 = new Character(mov.charAt(i));
                        Character c2 = new Character(s);
                        if (c1.equals(c2)) {
                            returnStr = returnStr + s + " ";
                        } else {
                            returnStr = returnStr + "_" + " ";
                        }
                    } else {
                        returnStr = returnStr + mov.charAt(i) + " ";
                    }
                }
            }
        }
        return returnStr;
    }

    /**
     * and return true return false.
     *
     * @param str str
     * @return ret
     */
    public boolean checkFinal(final String str) {
        final int nineFive = 95;
        for (int i = 0; i < str.length(); i++) {
            if ((int) str.charAt(i) == nineFive) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param usedValue usedValue
     * @param allValue  it will keep track of all the used chars and returns a
     *                  string of un used chars
     */
    public void remainingChars(final String allValue, final String usedValue) {
        String rem = "";
        for (int i = 0; i < allValue.length(); i++) {
            if (usedValues.indexOf(allValue.charAt(i)) == -1) {
                rem = rem + allValue.charAt(i);
            }
        }
        System.out.println("Charachters remained for guessing: " + rem);
    }
}

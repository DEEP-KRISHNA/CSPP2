import java.io.File;
import java.io.IOException;

/**
 * Document
 */
public class Document {

    private int noOfLines;
    private int noOfWords;
    private String[] words;

    public Document() {
    }

    Document(File file) throws IOException {
        DocumentDB d = new DocumentDB(file);
    }

    public int getNoOfLines() {
        return noOfLines;
    }

    public void setNoOfLines(int noOfLines) {
        this.noOfLines = noOfLines;
    }

    public int getNoOfWords() {
        return noOfWords;
    }

    public void setNoOfWords(int noOfWords) {
        this.noOfWords = noOfWords;
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

}
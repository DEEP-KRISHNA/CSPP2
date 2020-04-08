/**
 * @author Sandeep Kolli
 */

public class task{
    private String name;
    private String description;
    private String date;
    private String status;

    public task(String s1, String s2, String s3, String s4){
        name=s1;
        description=s2;
        date=s3;
        status=s4;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String getDate(){
        return date;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String s1){
        status=s1;
    }
}
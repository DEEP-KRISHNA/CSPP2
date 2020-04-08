import java.util.*;

public class User {
    public String name;
    int sizee;
    String [] connect = new String[100];
    User(String name){
        this.name=name;
        sizee=0;
    }
    User(String name, String connection){
        this.name=name;
        sizee=0;
    }
    public void addUserConnect(String s){
        connect[sizee]=s;
        sizee++;
    }

    public String getUserName(){
        return name;
    }

    public void addMoreConnects(String s[]){
        if(s!=null){
        for(int i=0;i<s.length;i++)
        {
            connect[sizee]=s[i];
            sizee++;
        }
    }
    }

    public String[] getUserConnections(){
        if(sizee>0){
        String connectt [] = new String[sizee];
        for(int i=0;i<sizee;i++){
            connectt[i]=connect[i];
        }
        return connectt;
    }
    else return null;
    }
    
}
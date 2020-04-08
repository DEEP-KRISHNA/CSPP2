
/*
* @author Sandeep Kolli
*/


import java.util.regex.*;

class CardCatalog{
    int CatalogSize;
    Card [] CardLib;
    int max;
    CardCatalog(){
        CatalogSize=0;
        max=10;
        CardLib = new Card[10];
    }

    private void sort(){
        Card Temp = new Card("","","");
        for(int i=CatalogSize-1;i>=0;i--){
            for(int j=1;j<=i;j++){
                if(CardLib[j-1].title.compareTo(CardLib[j].title)>0){
                    Temp=CardLib[j-1];
                    CardLib[j-1]=CardLib[j];
                    CardLib[j]=Temp;
                }
            }
        }
    }

    public void AddCard(Card a)
    {
        if(CatalogSize<max){
            CardLib[CatalogSize]=a;
            CatalogSize++;
        }else{
            max=CatalogSize+1;
            Card [] newCardLib = new Card[max];
            for(int i=0;i<CatalogSize;i++){
                newCardLib[i]=CardLib[i];
            }
            newCardLib[CatalogSize]=a;
            CatalogSize++;
            CardLib=newCardLib;
        }
        sort();
    }

    public void removeATitle(String a)
    {
        for(int i=0;i<CatalogSize;i++){
            if(CardLib[i] != null){
            if(CardLib[i].title==a){
                CardLib[i]=CardLib[CatalogSize-1];
                CardLib[CatalogSize-1]=null;
                CatalogSize=CatalogSize-1;
            }}}
            sort();
    }

    public String [] getAuthor(String a){
        int j=0;
        for(int i=0;i<CatalogSize;i++){
            if(CardLib[i] != null){
            if(CardLib[i].author==a){
                j++;
            }}}
        String [] authorList=new String[j];
        int k=0;
        for(int i=0;i<CatalogSize;i++){
            if(CardLib[i] != null){
            if(CardLib[i].author==a){
                authorList[k]=CardLib[i].author;
                k++;
            }}}
        return authorList;
    }

    public String [] getSubject(String a){
        int j=0;
        String regex = ".*"+a+".*";
        for(int i=0;i<CatalogSize;i++){
            if(CardLib[i] != null){
            if(Pattern.matches(regex, CardLib[i].subject)){
                j++;
            }}}
        String [] authorList=new String[j];
        int k=0;
        for(int i=0;i<CatalogSize;i++){
            if(CardLib[i] != null){
            if(Pattern.matches(regex, CardLib[i].subject)){
                authorList[k]=CardLib[i].author;
                k++;
            }}}
        return authorList;
    }

    public Card getTitle(String a){
        Card title = new Card("","","");
        int min=0;
        int counter=0;
        int max=CatalogSize;
        int mid=CatalogSize/2;
        while(counter<=CatalogSize){
            if(CardLib[mid].title.compareTo(a)==0)
            { 
                title=CardLib[mid];
                return title;
            }
            else{
            if(CardLib[mid].title.compareTo(a)>0) max=mid;
            else min=mid;
            mid=((min+max)/2);
            }
            counter++;    
        }
        return title;
    }

    public void PrintCatalog()
    {
        for(int i=0;i<CatalogSize;i++){
            if(CardLib[i] != null){
            System.out.print("Title: "+CardLib[i].title+" | "+"Author: " +CardLib[i].author+" | "+"Subject: " +CardLib[i].subject);
            System.out.println("");
            }
            else{
                System.out.println("");
            }}
    }
}
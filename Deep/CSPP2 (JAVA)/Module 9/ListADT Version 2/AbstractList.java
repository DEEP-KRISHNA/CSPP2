
/**
 * @author Sandeep Kolli
 */

class AbstractList implements ListInterface{
    private int [] list;
    private int length;
    private int size;

    AbstractList()
    {
        length=0;
        size=10;
        list=new int[size];
    }

    public int getLength(){
        return length;
    }

    public void setLength(int i){
        length=i;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int i){
        size=i;
    }

    public int getArray(int i){
        return list[i];
    }

    public void setArray(int i,int j){
        list[i]=j;
    }

    public void setNewArray(int []i){
        list=i;
    }
    
    public int size() {
        // replace the code below to implement the size method
        //  Your code goes here.....
        return length;
    }

    public int get(int index) {
        // Replace the code below to write the code for get
        // Your code goes here.....
        if(index>=0){
        if(index<length) return list[index];
        else return -1;
        }
        else return -1;
    }

    public String toString() {
        // Your code goes here.....
        String str="[";
        for(int i=0;i<length;i++){
            str=str+list[i];
            if (i!=length-1) str=str+",";
        }
        str=str+"]";
        return str;
    } 

    public boolean contains(int item) {
        // Your code goes here.....
        for(int i=0;i<length;i++){
            if(list[i]==item) return true;
        }
        return false;
    }

    public int indexOf(int item) {
        // Your code goes here.....
        for(int i=0;i<length;i++){
            if(list[i]==item) return i;
        }
        return -1;
    }
    
    public void remove(int index) {
        // write the logic for remove here.
        // Think about what to do to the getSize() variable.
        // Your code goes here.....
        if(index<getLength())
        {
        for(int i=index;i<getLength()-1;i++){
            setArray(i,getArray(i+1));
        }
        setArray(getLength()-1, 0);
        setLength(getLength()-1);
        }
    }

    public void add(int item) {}
}
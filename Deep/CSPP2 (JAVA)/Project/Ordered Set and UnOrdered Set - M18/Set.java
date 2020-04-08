
/**
 * 
 * @author Sandeep Kolli
 */

public class Set<E extends Comparable<E>> extends AbstractSet<E> {

    /*
     * The add method does what the name suggests. Add an int item to the list. The
     * assumption is to store the item at the end of the list What is the end of the
     * list? Is it the same as the end of the listay? Think about how you can use
     * the size variable to add item to the list.
     * 
     * The method returns void (nothing)
     */

    public void add(E item) {
        // Inserts the specified element at the end of the list.
        if (indexOf(item) == -1) {
            if (getLength() < getSize()) {
                setArray(getLength(), item);
                int len = getLength();
                setLength(++len);
            } else {
                E arr1[] = (E[]) new Comparable[2 * getSize()];
                setSize(getSize() * 2);
                for (int i = 0; i < getLength(); i++) {
                    arr1[i] = getArray(i);
                }
                setNewArray(arr1);
                setArray(getLength(), item);
                setLength(getLength() + 1);
            }
        }
    }
}
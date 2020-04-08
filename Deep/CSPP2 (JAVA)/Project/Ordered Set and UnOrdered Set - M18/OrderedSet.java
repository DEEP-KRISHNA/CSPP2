
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Sandeep Kolli
 * @param <E> type
 */

public class OrderedSet<E extends Comparable<E>> extends AbstractSet<E> {

    /**
     * @param item - adds The add method does what the name suggests. Add an int
     *             item to the list. The assumption is to store the item at the end
     *             of the list What is the end of the list? Is it the same as the
     *             end of the listay? Think about how you can use the size variable
     *             to add item to the list.
     *
     *             The method returns void (nothing)
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
        E a[] = getFullLengthArray();
        int n = getLength();
        E temp = null;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (a[j - 1].compareTo(a[j]) > 0) {
                    // swap elements
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        setNewArray(a);
    }
}


/**
 * @author Sandeep Kolli
 */

public class List<E extends Comparable<E>> extends AbstractList<E> {

    /**
     * This method adds the item at a particular index after moving all the elements
     * to the right position by one.
     * 
     * @param index where the element to be added
     * @param item  to be added at a particular index.
     * @throws InvalidException if index is not in the range of 0 and size-1
     */

    public void add(E item) {
        // Inserts the specified element at the end of the list.
        // Your code goes here.....
        if (getLength() < getSize()) {
            setArray(getLength(), item);
            setLength(getLength() + 1);
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

    /**
     * This method returns the sublist from this list based on fromIndex and
     * toIndex.
     * 
     * @param fromIndex the new list contains the elements based on fromIndex in
     *                  this list.
     * @param toIndex   the new list contains the elements upto toIndex in this
     *                  list.
     * @return a List which is a subList of this list.
     * @throws InvalidException if fromIndex and toIndex is invalid.
     */

    public List<E> subList(int fromIndex, int toIndex) throws InvalidException {
        // TODO
        // Your code goes here.
        if (fromIndex < 0) {
            throw new InvalidException("fromIndex is less than 0");
        } else if (fromIndex == toIndex) {
            throw new InvalidException("fromIndex is greater than or equal to toIndex");
        } else if (toIndex > getLength()) {
            throw new InvalidException("toIndex is greater than size");
        } else {
            List<E> l1 = new List<E>();
            for (int i = fromIndex; i < toIndex; i++) {
                l1.add(getArray(i));
            }
            return l1;
        }
        // return null;
    }
}
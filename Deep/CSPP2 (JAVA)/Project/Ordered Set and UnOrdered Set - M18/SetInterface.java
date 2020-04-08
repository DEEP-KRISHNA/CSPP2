
/**
 * This acts as an interface (Generic Set API) for the client.
 * 
 * @author Sandeep Kolli
 */

public interface SetInterface<E extends Comparable<E>> {
    /**
     * Adds an item to this List.
     */
    public void add(E item);

    /**
     * Thid method returns the number of elements in this list. if list is empty,
     * then it returns 0 by default.
     * 
     * @return the number of elements in this list.
     */

    public E get(int index) throws InvalidException;

    /**
     * This method returns the index of an item. If the item is not present in the
     * list, then return -1.
     * 
     * @param item, to be used to find the index.
     * @return the index of the element if present, -1 otherwise.
     */
    public int indexOf(E item);

    /**
     * This method returns true if the item is present in this list. If the item is
     * not present, then return false.
     * 
     * @param item, to be used to find whether it is present in this list.
     * @return true if item is present in this list and false otherwise.
     */
    public boolean contains(E item);

    /**
     * This method will removes the element at a particular index. Think of once you
     * remove the element, there will be a empty space.
     * 
     * Now move all the items to the left by one position.
     * 
     * Please see the comemnts in Assignment - 2 for more details in Polymorphism
     * and Abstract Data Type.
     * 
     * @param item, to be removed from a particular index in this list.
     * @throws throws an exceptions if the index is not in bounds.
     */
    public void remove(int index) throws InvalidException;

    /**
     * Adds all the elements of arr to this list.
     * 
     * @param arr to be added to this list.
     */
    public void addAll(E[] arr) throws InvalidException;

    /**
     * This method adds all the elements of lst to this list.
     * 
     * @param lst to be added to this list.
     * @throws InvalidException if fails in retrieving the elements from lst.
     */

    public void addAll(List<E> lst) throws InvalidException;

    /**
     * This method returns the last index of the element. if not found returns -1
     * 
     * @param set to be searched in this list.
     * @return true if subset is there else false
     */

    public boolean isSubSet(Set<E> set);

    /**
     * This method returns the set of union of both sets
     * 
     * @param set to be added into set.
     * @return set after operation
     */

    public void union(Set<E> set1, Set<E> set2);

    /**
     * This method returns the set of intersection of both sets
     * 
     * @param set to be find matching into set.
     * @return set after operation
     */

    public void intersection(Set<E> set1, Set<E> set2);
}
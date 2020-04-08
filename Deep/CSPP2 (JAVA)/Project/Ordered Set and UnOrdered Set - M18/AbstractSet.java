/**
 * 
 * @author Sandeep Kolli
 */

public class AbstractSet<E extends Comparable<E>> extends AbstractList<E> implements SetInterface<E> {

    public boolean isSubSet(Set<E> set) {
        E a[] = set.getFullLengthArray();
        for (int i = 0; i < a.length; i++) {
            if ((a[i] != null)) {
                if (indexOf(a[i]) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * This method returns the set of union of both sets
     * 
     * @param set to be added into set.
     * @return set after operation
     */

    public void union(Set<E> set1, Set<E> set2) {
        E a1[] = set1.getFullLengthArray();
        E a2[] = set2.getFullLengthArray();
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != null) {
                add(a1[i]);
            }
        }
        for (int i = 0; i < a2.length; i++) {
            if (a2[i] != null) {
                add(a2[i]);
            }
        }
    }

    /**
     * This method returns the set of intersection of both sets
     * 
     * @param set1 to be find matching into set.
     * @param set2 to be find matching into set.
     */

    public void intersection(Set<E> set1, Set<E> set2) {
        E a1[] = set1.getFullLengthArray();
        E a2[] = set2.getFullLengthArray();
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1.length; j++) {
                if ((a1[i] != null) && (a2[j] != null)) {
                    if (a1[i].compareTo(a2[j]) == 0) {
                        add(a1[i]);
                    }
                }
            }
        }
    }

    /**
     * This method displays all the elemenys in the set.
     */

    public void displaySet() {
        System.out.println();
        System.out.println("The Elements in the set are : ");
        for (int i = 0; i < getLength(); i++) {
            System.out.println(getArray(i));
        }
    }
}

public class Sample {
    /**
     * @author Sandeep Kolli sample class calls all the methods
     */
    public static void main(String[] args) {
        Set<Float> a = new Set<Float>();
        a.add(2.0f);
        a.add(1.0f);
        a.add(3.0f);
        a.add(1.0f);
        // System.out.println(a.indexOf(3.0f));
        // System.out.println(a.indexOf(2.0f));
        // System.out.println(a.indexOf(1.0f));

        Set<Float> b = new Set<Float>();
        b.add(2.0f);
        b.add(1.0f);
        System.out.println(a.isSubSet(b));

        Set<Float> c = new Set<Float>();
        c.add(5.0f);
        c.add(1.0f);

        Set<Float> d = new Set<Float>();
        d.intersection(b, c);
        d.displaySet();

        Set<Float> e = new Set<Float>();
        e.union(a, c);
        e.displaySet();

    }
}
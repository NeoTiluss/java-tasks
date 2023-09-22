import java.util.HashSet;
import java.util.Iterator;

public class O1DeleteDataStructure<T> {
    private HashSet<T> set;

    public O1DeleteDataStructure() {
        set = new HashSet<>();
    }

    public void add(T data) {
        set.add(data);
    }

    public void delete(T data) {
        set.remove(data);
    }

    public void print() {
        Iterator<T> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        O1DeleteDataStructure<Integer> ds = new O1DeleteDataStructure<>();
        
        ds.add(1);
        ds.add(2);
        ds.add(3);
        
        ds.print(); // Output: 1 2 3
        
        ds.delete(2);
        
        ds.print(); // Output: 1 3
    }
}

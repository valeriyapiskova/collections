package setter;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> book = new HashSet<>();

        book.add("the green mille");
        book.add("and of watch");
        book.add("mr Mersedes");

        Set<String> magasine = new HashSet<>();
        magasine.add("Forbes");
        magasine.add("Criminal History");
        magasine.add("Education");
        Set<String> union = new HashSet<>(book);
        union.addAll(magasine);
        System.out.println(union);

        Set<String> intersect = new HashSet<String>(book);
        intersect.retainAll(magasine);
        System.out.println(intersect);



    }
}

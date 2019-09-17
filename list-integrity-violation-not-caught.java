import java.util.List;
import java.util.ArrayList;

/*
 * From p. 269
 *
 * This is pretty wild. As long as you don't try to cast
 * an Integer to a String, then no runtime errors will
 * occur.
 *
 */

class Main {
    public static void main(String[] args) {
        List<?> ulist = new ArrayList<String>();
        List<Integer> ilist = (List<Integer>) ulist;
        ilist.add(123);
        ilist.add(1);
        ilist.add(3);
        ilist.add(2);

        for (int i : ilist) {
            System.out.println(i);
        }
    }
}


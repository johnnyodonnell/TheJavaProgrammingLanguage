import java.util.List;
import java.util.ArrayList;

/*
 * From p. 259
 *
 * """
 * You can't add an element to a queue referenced through a variable
 * that has an unbounded or upper-bounded type
 * """
 *
 * You can add the lowest possible subclass for a collection
 * of a lower-bounded type
 *
 */

class Main {
    public static void main(String[] args) {
        List<? super String> list = new ArrayList<Object>();
        list.add("String");

        // Attempting to add an Object causes a compile time error
        // list.add(new Object());
    }
}


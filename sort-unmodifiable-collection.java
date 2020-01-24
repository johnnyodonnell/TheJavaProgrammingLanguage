import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * From p. 601
 *
 * """
 * if you expose your information as an unmodifiable list, it can be
 * searched and sorted without your having to define search and sort
 * methods.
 * """
 *
 * I think this is a mistake to say that sort can be used on an
 * unmodifiable list.
 *
 */

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(1);

        List<Integer> uList = Collections.unmodifiableList(list);

        System.out.println(uList);
        Collections.sort(uList);
        System.out.println(uList);
    }
}


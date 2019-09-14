import java.util.List;
import java.util.ArrayList;

/*
 * From p. 266
 *
 * """
 * For capture conversion to apply, there must be a unique mapping
 * between the capture of the wildcard and the type of variable involved.
 * This leads to some general restrictions on when capture conversion
 * can apply.
 * """
 *
 * Both of these restrictions feel like quirks rather than intentional
 * features of the language design.
 *
 * For the `nothing` method, the author notes the following reason
 * for why this is a restriction:
 * """
 * The method requires a `List` with elements that are all the same
 * type, but a `List` with an element type of `List<?>` could contain
 * a `List<String>`, a `List<Object>`, and so forth, so capture
 * conversion doesn't apply in this case.
 * """
 *
 * However, this reason appears to be weakened by the counter point
 * code in the `main` method.
 *
 */

class Main {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
        // identical(list, list); // Compile time error

        List<List<?>> listOfLists = new ArrayList<List<?>>();
        // nothing(listOfLists); // Compile time error

        /*
         * Counter point code
         */
        List<String> strList = new ArrayList<String>();
        strList.add("str1");
        strList.add("str2");
        listOfLists.add(strList);

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        listOfLists.add(intList);
    }

    static <T> boolean identical(List<T> list1, List<T> list2) {
        return list1 == list2;
    }

    static <T> void nothing(List<List<T>> list) {}
}


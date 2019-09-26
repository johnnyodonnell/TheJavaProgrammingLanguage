import java.util.List;
import java.util.ArrayList;

/*
 * An example showing the limits of generic type inference.
 *
 * This helps to explain the limits of capture conversion
 * on p. 266
 *
 * That being said, the limits on capture conversion feel like quirks
 * rather than intentional features of the language design, as
 * mentioned in the file `capture-conversion.java`.
 *
 * The limits on general generic type inference shown below in `foo`
 * also feel like quirks in the language.
 *
 */

class Main {
    public static void main(String[] args) {
        Object o = bar("String", 123);
        List<?> list =
            bar(new ArrayList<String>(), new ArrayList<Integer>());

        /*
         * This causes a compile-time error.
         * It's interesting that the compiler is unable to deduce
         * the type `T` here.
         *
         */
        // list = foo(new ArrayList<String>(), new ArrayList<Integer>());
    }

    static <T> T bar(T t, T t2) {
        return t;
    }

    static <T> List<T> foo(List<T> list1, List<T> list2) {
        return list1;
    }
}


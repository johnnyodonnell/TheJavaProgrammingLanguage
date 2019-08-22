import java.util.List;
import java.util.ArrayList;

/*
 * From p. 31
 *
 * """
 * Even though Integer is a subtype of Object,
 * Lookup<Integer> is not a subtype of Lookup<Object> and
 * therefore an instance of the former can not be used where
 * an instance of the latter is required.
 * """
 *
 * This program will fail at compilation.
 *
 * An explanation for why generics are not implicity polymorphic
 * see this discussion:
 * https://stackoverflow.com/questions/2745265/is-listdog-a-subclass-of-listanimal-why-are-java-generics-not-implicitly-po
 *
 */

class Main {
    public static void main(String[] args) {
        function(new ArrayList<String>());
    }

    public static void function(List<Object> list) {
        // Do nothing
    }
}


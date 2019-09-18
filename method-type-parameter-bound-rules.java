import java.util.List;

/*
 * Not from any page
 *
 * Why does the second version of `foo` not work?
 *
 * It would nice to get an official explanation or at least a
 * third-party explanation; however, it appears to make sense
 * that this rule exists. In the second version of `foo`
 * its not clear that the return type must extend `String`.
 * Because a method type parameter can be used as a type in the
 * method parameter and as the return type, it makes sense
 * to only allow bounds to be applied where the type parameter
 * is declared.
 *
 */

class Main {
    <T extends String> T foo(List<T> t) {
        return t.get(0);
    }

    /*
     * Compile time error
     *
    <T> T foo(List<T extends String> t) {
        return t.get(0);
    }
     */
}



/*
 * From p. 225
 *
 * """
 * If more than one method remains, and they have different signatures,
 * then the invocation is ambiguous and the invoking code invalid because
 * there is not specific method.
 * """
 *
 * Methods `a` and `b` provide the opportunity for this to happen.
 *
 * """
 * If all remaining methods have the same signature then: if all are
 * abstract then one is chosen arbitrarily; otherwise if only one is
 * not abstract then it is chosen; otherwise the invocation is again
 * ambiguous and is invalid.
 * """
 *
 * The method `c` when used like `Main.<CA>c(null)` will result in
 * two methods with the same signature.
 *
 * Java 12 Spec:
 * https://docs.oracle.com/javase/specs/jls/se12/html/jls-15.html#jls-15.12.2.5
 *
 */

interface IA {};

interface IB {};

class CA implements IA, IB {};

class Main {
    static void a(int i, Boolean b) {
        System.out.println("a-1");
    }

    static void a(Integer i, boolean b) {
        System.out.println("a-2");
    }

    static void b(IA i) {
        System.out.println("b-1");
    }

    static void b(IB i) {
        System.out.println("b-2");
    }

    static <T extends IA> void c(T i) {
        System.out.println("c-1");
    }

    static <T extends IB> void c(T i) {
        System.out.println("c-2");
    }

    public static void main(String[] args) {
        // a(10, true); // compile-time error
        a(10, Boolean.valueOf(true));
        a(Integer.valueOf(10), true);

        // b(new CA()); // compile-time error
        IA ia = new CA();
        IB ib = new CA();
        b(ia);
        b(ib);

        // Main.<CA>c(null); // compile-time error
        Main.<IA>c(null);
        Main.<IB>c(null);
    }
}


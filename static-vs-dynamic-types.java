
/*
 * From p. 263
 *
 * """
 * Type inference is based on the static type of the argument expressions
 * that are being passed, not their dynamic types
 * """
 *
 * This is the first mention of static vs dynamic type and this concept
 * seems like it would be relevant to overload resolution
 *
 */

class Main {
    public static void main(String[] args) {
        String s = "String";
        s = passThrough(s);

        Object o = s;
        o = passThrough(o);

        o = passThrough(s);

        // Compile time error
        s = passThrough(o);
    }

    static <T> T passThrough(T t) {
        return t;
    }
}


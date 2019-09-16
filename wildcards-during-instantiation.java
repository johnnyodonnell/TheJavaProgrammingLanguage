
/*
 * From p. 260
 *
 * """
 * you can't define a class that implements `List<?>`. However, the
 * type argument may itself be a parameterized type with a type
 * argument that is a wildcard so implementing `List<List<?>>` is
 * okay.
 * """
 *
 * My example below is similar to the example described in the text;
 * however, my example deals with instantiation rather than with
 * extending a class.
 *
 * I can't think of a reason for why one would be okay and not the
 * other. My guess is that this is just a quirk in the language
 * rather than an intentional design.
 *
 * See here for more:
 * https://stackoverflow.com/q/57959379/5832619
 *
 */

class MyObject<T> {}

class Main {
    public static void main(String[] args) {
        // Compile error
        // MyObject<?> mo = new MyObject<?>();

        MyObject<MyObject<?>> moMo = new MyObject<MyObject<?>>();
    }
}


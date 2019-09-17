
/*
 * From p. 251
 *
 * """
 * the compiler has to know at compile time what code to generate to
 * create any objects or arrays.
 * """
 *
 * Why can't an array be generic? The array will require the same
 * amount of memory regardless of the object type.
 *
 * Answer:
 * https://stackoverflow.com/a/2927427/5832619
 * https://softwareengineering.stackexchange.com/questions/181439/why-cant-java-generics-be-in-arrays
 *
 * From p. 268
 *
 * """
 * You cannot create an array whose element type is a parameterized type
 * """
 *
 * Further explanation:
 * https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createArrays
 *
 * In this explanation, it's interesting that a `List<List<?>>` would
 * suffer from the same problem. So maybe arrays have a more strict
 * type contract than reference type objects.
 *
 */

class Generic<T> {
    T[] generate() {
        return new T[10];
    }
}

class Main {
    public static void main(String[] args) {
        String[] strings = new Generic<String>().generate();
    }
}


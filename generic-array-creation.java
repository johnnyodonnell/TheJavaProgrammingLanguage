
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



/*
 * From p. 131
 *
 * """
 * An abstract class can have a partial implementation, protected
 * parts, static methods, and so on, whereas interfacse are limited
 * to public constants and public methods with no implementation.
 * """
 *
 * This isn't true anymore. Not sure in which version this changed,
 * interfaces have much more capability now.
 *
 * The `default` modifier isn't covered in the book, but I do know that
 * interfaces can declare method implementations if they are modified
 * with the `default` modifier.
 *
 * It looks like the `default` modifier acts somewhat like the
 * `protected` modifier
 *
 * In conclusion, I still think that implemenation in interfaces
 * should be avoided. The ability to add implementation in interfaces
 * was due to the need to provide backwards compatibility. Thus,
 * this is probably the only reason that would justify providing
 * implementation in an interface. Also, the book seems to suggest
 * that interfaces were introduced in order to provide multiple
 * inheritance without worrying about the problems of multiple
 * implementation inheritance. Adding implemenation to interfaces
 * resurfaces the problem of multiple implementation inheritance.
 *
 * Finally, default methods can't be modified to be `final`.
 *
 */

interface First {
    default void print() {
        System.out.println("Hello from First");
    }
}

interface Second {
    /*
     * Uncommenting this method will result in a
     * compile-time error
     *
    default void print() {
        System.out.println("Hello from Second");
    }
    */
}

class MyObject implements First, Second {
    void callPrint() {
        print();
    }
}

class Main {
    public static void main(String[] args) {
        // This throws a compile-time error
        // new MyObject.print();

        new MyObject().callPrint();
    }
}


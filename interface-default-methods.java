
/*
 * This isn't covered in the book, but I do know that interfaces
 * can declare method implementations if they are modified
 * with the `default` modifier.
 *
 * It looks like the `default` modifier acts somewhat like the
 * `protected` modifier
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


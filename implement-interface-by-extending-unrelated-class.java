
/*
 * This isn't from the book, but this is interesting.
 *
 * A class can implement an interface by extending a class
 * that does not explicitly implement that interface.
 *
 */

interface Printable {
    void print();
}

class Base {
    public void print() {
        System.out.println("Hello World");
    }
}

class MyClass extends Base implements Printable {}



/*
 * From p. 89
 *
 * I wrote out this example because I found it odd that the author
 * used a cast operation to set `this` equal to a reference type
 * of that object's superclass. As shown below, this isn't needed
 * and I'm not sure why it's used in the book.
 *
 * From p. 92
 *
 * """
 * This cast was unnecessary but emphasized that we really wanted
 * the current object to be treated as an instance of its superclass.
 * """
 *
 */

class Base {
    public String message = "Hi from Base.";
}

class Derived extends Base {
    public String message = "Hi from Derived.";

    void print() {
        Base base = this;
        System.out.println(base.message);
    }
}

class Main {
    public static void main(String[] args) {
        new Derived().print();
    }
}


import java.util.ArrayList;

/*
 * From p. 138
 *
 * """
 * This is further reinforced by the qualified-super reference, which
 * allows access to members of the enclosing instance's superclass that
 * have been hidden, or overriden, by the enclosing class.
 * """
 *
 * The feature listed above is pretty cool, but the intended
 * behavior below is not possible.
 *
 */

class Enclosing {
    class Inner extends ArrayList<String> {
        public String get(int index) {
            return "Inner: " + super.get(index);
        }
    }

    void print() {
        Inner inner = new Inner();
        inner.add("Hello World!");
        System.out.println(inner.get(0));
        System.out.println(inner.super.get(0));
    }
}

class Main {
    public static void main(String[] args) {
        new Enclosing().print();
    }
}


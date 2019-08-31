
/*
 * Not from any page in particular, but I wanted to see if
 * inner classes had reference types.
 *
 * This is pretty cool. Inner classes act somewhat like closures.
 *
 */

class Outer {
    private final String message;

    Outer(String message) {
        this.message = message;
    }

    class Inner {
        void print() {
            System.out.println(message);
        }
    }

    Inner create() {
        return new Inner();
    }
}

class Main {
    public static void main(String[] args) {
        Outer.Inner inner =  new Outer("Hello World!").create();
        inner.print();

        inner = new Outer("Hello one mo gin!").create();
        inner.print();
    }
}


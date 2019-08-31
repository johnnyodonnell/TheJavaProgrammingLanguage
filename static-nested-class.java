
/*
 * From p. 133
 *
 * """
 * A nested type is considered a part of its enclosing type
 * and the two share a trust relationship in which each can
 * access all members of the other.
 * """
 *
 */

class Enclosing {
    private static String staticMessage = "Hello from static field";
    private String message = "Hello from non-static field";

    private static class Nested {
        private void print() {
            System.out.println(new Enclosing().message);
            System.out.println(staticMessage);
        }

        public String toString() {
            return "I am an Enclosing.Nested object.";
        }
    }

    Nested print() {
        Nested nested = new Nested();
        nested.print();
        return nested;
    }
}

class Main {
    public static void main(String[] args) {
        Object nested = new Enclosing().print();
        System.out.println(nested);
    }
}


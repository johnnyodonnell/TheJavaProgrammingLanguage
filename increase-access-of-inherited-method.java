
/*
 * From p. 85
 *
 * """
 * A subclass can change the access of a superclass's methods, but only
 * to provide more access.
 * """
 *
 * I thought there might be a way to do this without explicity overriding
 * the superclass method, but I think this is what the author meant.
 *
 */

class Base {
    protected void print() {
        System.out.println("Hello World!");
    }
}

class Derived extends Base {
    public void print() {
        super.print();
    }
}

class Main {
    public static void main(String[] args) {
        new Base().print();
        new Derived().print();
    }
}


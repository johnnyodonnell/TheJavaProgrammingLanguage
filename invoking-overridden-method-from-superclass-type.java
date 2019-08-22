
/*
 * From p. 26
 *
 * """
 * invoking a method uses the actual class of the object,
 * not the type of the object reference.
 * """
 *
 * This is similiar to the behavior of C++, but C++ has some
 * nuances to consider.
 * See: https://github.com/johnnyodonnell/TheCppProgrammingLanguage/blob/master/virtual-functions.cpp
 *
 */

class Base {
    void print() {
        System.out.println("Printing from Base");
    }
}

class Derived extends Base {
    void print() {
        System.out.println("Printing from Derived");
    }
}

class Main {
    public static void main(String[] args) {
        Base object = new Derived();
        object.print(); // prints: "Printing from Derived"
    }
}


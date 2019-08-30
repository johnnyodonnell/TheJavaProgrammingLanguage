
/*
 * From p. 131
 *
 * In Java 5 I don't belive that this was possible. However, somewhere
 * along the way this became possible.
 *
 */

interface Printer {
    public static void print() {
        System.out.println("Hello World!");
    }
}

interface Main {
    public static void main(String[] args) {
        Printer.print();
    }
}


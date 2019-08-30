
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


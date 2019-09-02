
/*
 * From p. 162
 *
 * Java supports Unicode for source code characters. However, some
 * Unicode characters look strikingly similar. The o's in the first
 * method are different than the o's in the second method
 *
 */

class Main {
    private static void foo() {
        System.out.println("First");
    }

    private static void fоо() {
        System.out.println("Second");
    }

    public static void main(String[] args) {
        foo();
        fоо();
    }
}


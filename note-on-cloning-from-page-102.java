
/*
 * From p. 102
 *
 * The example on page 102 assumes that `HerClass` either doesn't
 * override the Object#clone method or that it overrides the
 * Object#clone method but still uses the Object#clone method
 * to return its result.
 *
 * Also note that since these classes don't use Object#clone,
 * they don't actually need to implement `Cloneable` in order
 * to clone themselves.
 *
 */

class HerClass {
    public HerClass clone() throws CloneNotSupportedException {
        return new HerClass();
    }
}

class MyClass extends HerClass {
    public MyClass clone() throws CloneNotSupportedException {
        return (MyClass) super.clone();
    }
}

class Main {
    public static void main(String[] args) throws Throwable {
        HerClass herClass = new HerClass();
        System.out.println(herClass);
        System.out.println(herClass.clone());

        MyClass myClass = new MyClass();
        System.out.println(myClass);
        System.out.println(myClass.clone());
    }
}


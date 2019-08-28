
/*
 * This isn't from any page in particular, but I thought this was
 * interesting because this shows that a class cannot make a
 * protected method from another package accessible to the current
 * package just by extending that class. It has to in fact override
 * the method and make it available
 *
 *
 */

class MyClass implements Cloneable {
    /*
     * Commenting this out causes a compile-time error
     *
    protected MyClass clone() throws CloneNotSupportedException {
        return (MyClass) super.clone();
    }
    */
};

class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(new MyClass().clone());
    }
}


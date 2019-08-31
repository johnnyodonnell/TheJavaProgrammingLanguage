
/*
 * From p. 140
 *
 * This example is copied directly from p. 140 and I wanted to
 * add this example to this git repo so that I could add some
 * comments.
 *
 * The thing that is so interesting about this example is
 * that understanding `outer.super()` is not very intuitive.
 * One interpretation might be that you are calling a method
 * on outer that is called `super`, but `super` is a key word
 * and thus, isn't a valid method name. Another interpretation
 * is that we're calling outer's super constructor, which is
 * possible but not in this scope.
 *
 * In fact, what we're doing is calling `Unrelated`'s super
 * constructor and providing `outer` as an enclosing object.
 */

class Outer {
    class Inner {}
}

class Unrelated extends Outer.Inner {
    Unrelated(Outer outer) {
        outer.super();
    }
}


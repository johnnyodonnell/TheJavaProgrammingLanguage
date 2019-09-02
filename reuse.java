package Reuse;

/*
 * Compile with the following command:
 * javac -d . reuse.java
 *
 * From p. 179
 *
 * This program creates an infinite loop
 *
 */

class Reuse {
    Reuse Reuse(Reuse Reuse) {
        Reuse:
        for (;;) {
            if (Reuse.Reuse(Reuse) == Reuse) {
                break Reuse;
            }
        }

        return Reuse;
    }
}

class Main {
    public static void main(String[] args) {
        Reuse reuse = new Reuse();
        reuse.Reuse(reuse);
    }
}



/*
 * From p. 344
 *
 * """
 * One solution is to use Thread.currentThread to establish the identity of
 * the thread that invokes run and to compare it with the intended worker
 * thread.
 * """
 *
 * This is cool. I wanted to see this done in practice.
 *
 */

class Server implements Runnable {
    private Thread thread;

    Server() {
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        if(thread != Thread.currentThread()) {
            throw new RuntimeException(
                    "Server started from an unintended worker thread.");
        }

        try {
            while (true) {
                System.out.println("Server logging");
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Server server = new Server();
        server.run();
    }
}


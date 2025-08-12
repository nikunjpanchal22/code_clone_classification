public void print () {
    try {
        waitForSemaphore.acquire ();
        int start = nextStartIdx;
        for (int i = 0;
        i < 5; i ++) {
            System.out.println (String.format ("%d -- %s", i + start, Thread.currentThread ().getName ()));
        }
        nextStartIdx += 5;
        next.release ();
    } catch (InterruptedException ie) {
        Thread.currentThread ().interrupt ();
    }
}


public void print () {
    try {
        waitForSemaphore.acquire ();
        int start = nextStartIdx;
        for (int i = 0;
        i < 10; i ++) {
            System.out.println (String.format ("%d -- %s", i + start, Thread.currentThread ().getName ()));
        }
        nextStartIdx += 10;
        next.release ();
    } catch (InterruptedException ie) {
        Thread.currentThread ().interrupt ();
    }
}

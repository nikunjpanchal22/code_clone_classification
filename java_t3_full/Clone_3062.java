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
        for (int i = nextStartIdx; i < (nextStartIdx + 5); i ++) {
            System.out.printf ("%d -- %s%n", i, Thread.currentThread ().getName ());
        }
        nextStartIdx += 5;
        next.release ();
    } catch (InterruptedException ie) {
        Thread.currentThread ().interrupt ();
    }
}



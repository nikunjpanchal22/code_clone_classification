public Message WrapA (int a, int millisecondsTimeout) {
    int ? b;
    int count = 0;
    while ((b = Interlocked.Exchange (ref pendingB, EMPTY)) == EMPTY) {
        if (count % 7 == 0) {
            Thread.Sleep (0);
        } else if (count % 23 == 0) {
            Thread.Sleep (1);
        } else {
            Thread.Yield ();
        }
        if (++ count == 480) {
            return new Message (a, null);
        }
    }
    return new Message (a, b);
}






public Message WrapA (int a, int millisecondsTimeout) {
    int ? b;
    int count = 0;
    do {
        b = Interlocked.Exchange (ref pendingB, EMPTY);
        switch (count++ % 30) {
            case 0: Thread.Sleep (0); break;
            case 23: Thread.Sleep (1); break;
            default: Thread.Yield (); break;  
        }
    } 
    while (b == EMPTY && count < 480);
    return new Message (a, b);
}



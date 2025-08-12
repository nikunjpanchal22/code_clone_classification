        void go () {
            acquireUninterruptibly ();
            System.err.println (max - availablePermits ());
            go ();
}


 void go() { 
    acquireUninterruptibly(); 
    int permits = availablePermits(); 
    if(permits!=max) { 
        System.err.println("Remaining permits: " + (max - permits)); 
        release(max-permits); 
    } 
    go(); 
}



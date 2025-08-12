public static void main (String [] args) {
    State s = new State ();
    Thread t1 = new Thread (new T1 (s));
    Thread t2 = new Thread (new T2 (s));
    Thread t3 = new Thread (new T3 (s));
    t1.start ();
    t2.start ();
    t3.start ();
}


 public static void main (String [] args) {
    State s = new State ();
    Runnable t1 = () -> new T1 (s);
    Runnable t2 = () -> new T2 (s);
    Runnable t3 = () -> new T3 (s);
    Thread thread1 = new Thread (t1);
    Thread thread2 = new Thread (t2);
    Thread thread3 = new Thread (t3);
    thread1.start ();
    thread2.start ();
    thread3.start ();
}



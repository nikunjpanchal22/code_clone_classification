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
    Thread thread1 = new Thread (new T1 (s));
    Thread thread2 = new Thread (new T2 (s));
    Thread thread3 = new Thread (new T3 (s));
    thread1.setName ("Thread1");
    thread2.setName ("Thread2");
    thread3.setName ("Thread3");
    thread1.start ();
    thread2.start ();
    thread3.start ();
}



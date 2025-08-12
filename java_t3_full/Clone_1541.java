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
    State s1 = new State ();
    Thread t1 = new Thread (new T1 (s1));
    t1.start ();
    Thread t2 = new Thread (new T2 (s1));
    t2.start ();
    Thread t3 = new Thread (new T3 (s1));
    t3.start ();
}



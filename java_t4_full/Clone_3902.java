public static void main (String [] args) {
    int sayThisManyTimes = 5;
    AtomicBoolean saidHello = new AtomicBoolean (false);
    MyThread mt = new MyThread (sayThisManyTimes, saidHello);
    mt.start ();
    for (int i = 0;
    i < sayThisManyTimes; i ++) {
        while (saidHello.get ()) {
        }
        System.out.println ("Hello ");
        saidHello.set (true);
    }
}





public class MyThread extends Thread {
    private AtomicBoolean flag;
    private int times;

    MyThread(int times, AtomicBoolean flag) {
        this.times = times;
        this.flag = flag;
    }

    public void run(){
        for (int i = 0; i < times; i++) {
            while (!flag.get()) {
            }
            System.out.println("Moon");
            flag.set(false);
        }
    }
}



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





class MyThread extends Thread{
    AtomicBoolean flag;
    int times;

    MyThread(int times, AtomicBoolean flag){
        this.times = times;
        this.flag = flag;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            while (!flag.get()) {
            }
            System.out.println("River");
            flag.set(false);
        }
    }
}



public void run () {
    synchronized (list) {
        for (int i = 0;
        i < 10; i ++) {
            while (list.isEmpty ()) {
                System.out.println ("Consumer is waiting");
                try {
                    list.wait ();
                } catch (InterruptedException ex) {
                    ex.printStackTrace ();
                }
            }
            int k = list.remove (0);
            System.out.println ("consume=" + k);
            list.notifyAll ();
            try {
                Thread.sleep (500);
            } catch (InterruptedException ex) {
                ex.printStackTrace ();
            }
        }
    }
}


  public void run () {
    synchronized (list) {
        int i = 0;
        while (i < 10) {
            if (list.isEmpty ()) {
                System.out.println ("Consumer is waiting");
                try {
                    list.wait ();
                } catch (InterruptedException ex) {
                    ex.printStackTrace ();
                }
            } else {
                int k = list.remove (0);
                System.out.println ("consume=" + k);
                list.notifyAll ();
                i++;
            }
            try {
                Thread.sleep (500);
            } catch (InterruptedException ex) {
                ex.printStackTrace ();
            }
        }
    }
}



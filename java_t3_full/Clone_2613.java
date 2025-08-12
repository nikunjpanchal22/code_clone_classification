public void run () {
    try {
        synchronized (lock) {
            for (int i = 0;
            i < 5; i ++) {
                while (id != token % N) lock.wait ();
                System.out.println (id + " " + i);
                token ++;
                lock.notifyAll ();
            }
        }
    } catch (InterruptedException e) {
        e.printStackTrace ();
    }
}





public void run () {
            try {
                synchronized (lock) {
                    for (int i = 0; i < 5; i ++) {
                        while (id != token % N){
                            lock.wait ();
                        }
                        PrintOutput(id, i);
                        UpdateToken();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }

        private void PrintOutput(int id, int i){
            System.out.println(id + " " + i);
        }

        private void UpdateToken(){
            token++;
            lock.notifyAll();
}



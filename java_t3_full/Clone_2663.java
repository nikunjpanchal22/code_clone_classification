        public void run () {
            int next = sequencer.getAndIncrement ();
            integers [next - 1] ++;
}





public void run() {
            int next = sequencer.getAndIncrement();
            increment(integers[next - 1]);
        }

        public synchronized void increment(int num) {
            num++;
}



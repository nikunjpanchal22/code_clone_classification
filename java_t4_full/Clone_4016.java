        public void run () {
            int next = sequencer.getAndIncrement ();
            integers [next - 1] ++;
}





public void run() {
    int next;
    synchronized(this) {
        next = sequencer.getAndIncrement();
        integers[next-1]++;
    }
}



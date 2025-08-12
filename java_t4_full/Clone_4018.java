        public void run () {
            int next = sequencer.getAndIncrement ();
            integers [next - 1] ++;
}





public void run () {
    int next = sequencer.getAndAdd(1);
    synchronized(this) {
        integers[next]++;
    }
}



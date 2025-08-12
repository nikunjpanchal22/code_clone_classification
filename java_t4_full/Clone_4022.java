        public void run () {
            int next = sequencer.getAndIncrement ();
            integers [next - 1] ++;
}






public void run () {
    int next = sequencer.incrementAndGet() - 1;
    integers [next]++;
}



        public void run () {
            int next = sequencer.getAndIncrement ();
            integers [next - 1] ++;
}





public void run() {
    AtomicInteger next = new AtomicInteger(sequencer.getAndIncrement());
    int index = next.get() - 1;
    integers[index]++;
}



        public void run () {
            int next = sequencer.getAndIncrement ();
            integers [next - 1] ++;
}





public void run() {
    int next = sequencer.get();
    sequencer.getAndAdd(1);
    integers[next - 1]++;
}



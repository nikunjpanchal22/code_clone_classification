        public void run () {
            int next = sequencer.getAndIncrement ();
            integers [next - 1] ++;
}





public void run() {
    int next = sequencer.accumulateAndGet(1, Integer::sum) - 1;
    integers[next]++;
}



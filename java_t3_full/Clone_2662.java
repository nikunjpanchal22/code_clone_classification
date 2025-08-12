        public void run () {
            int next = sequencer.getAndIncrement ();
            integers [next - 1] ++;
}





public void run() {
    int next = sequencer.updateAndGet(i -> i + 1);
    integers[next - 1]++;
}



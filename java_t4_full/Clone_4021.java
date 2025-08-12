        public void run () {
            int next = sequencer.getAndIncrement ();
            integers [next - 1] ++;
}





public synchronized void run() {
    int next = sequencer.getAndIncrement();
    integers[next-1] = integers[next-1] + 1;
}



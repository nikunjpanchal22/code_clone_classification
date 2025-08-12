        public int read () throws IOException {
            return newInput.read ();
}



public int read() throws IOException {
    synchronized (newInput) {
        return newInput.read();
    }
}



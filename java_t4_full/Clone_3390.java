        public int read () throws IOException {
            return newInput.read ();
}



public int read() throws IOException {
    if (newInput.available() > 0) {
        return newInput.read();
    } else {
        throw new IOException();
    }
}



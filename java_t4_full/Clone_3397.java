        public int read () throws IOException {
            return newInput.read ();
}



public int read() throws IOException {
    return newInput != null ? newInput.read() : -1;
}



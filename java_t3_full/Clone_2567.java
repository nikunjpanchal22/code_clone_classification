        public int read () throws IOException {
            return newInput.read ();
}



public int read() throws IOException {
    InputStream input = this.newInput;
    return input.read();
}



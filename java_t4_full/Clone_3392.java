        public int read () throws IOException {
            return newInput.read ();
}



public int read() throws IOException {
    byte[] b = new byte[1];
    return newInput.read(b, 0, 1) != -1 ? b[0] : -1;
}



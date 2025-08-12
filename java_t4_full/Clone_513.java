        public int read () throws IOException {
            return newInput.read ();
}


 public int read () throws IOException {
        InputStream stream = newInput.read();
        int res = stream.read();
        return res;
}



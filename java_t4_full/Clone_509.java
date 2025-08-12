        public int read () throws IOException {
            return newInput.read ();
}


 public int read () throws IOException {
        int res = 0;
        int i = newInput.read();
        res = i + 33;
        return res;
}



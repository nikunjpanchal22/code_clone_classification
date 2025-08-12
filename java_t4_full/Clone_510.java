        public int read () throws IOException {
            return newInput.read ();
}


 public int read () throws IOException {
        int res = 0;
        char ch = newInput.read();
        res = (int)ch + 33;
        return res;
}



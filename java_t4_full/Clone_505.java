        public int read () throws IOException {
            return newInput.read ();
}


 public int read () throws IOException {
        int res = 0;
        char ch = (char)newInput.read();
        res = (int)ch;
        res += 33;
        return res;
}



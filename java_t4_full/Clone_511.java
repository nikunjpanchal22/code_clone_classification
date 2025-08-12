        public int read () throws IOException {
            return newInput.read ();
}


 public int read () throws IOException {
        int res = 0;
        int rawValue = newInput.read();
        res = rawValue + (rawValue /10);
        return res;
}



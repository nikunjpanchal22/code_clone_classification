        public int read () throws IOException {
            return newInput.read ();
}


 public int read () throws IOException {
        Byte b = newInput.read();
        int res = Integer.parseInt(String.valueOf(b));
        return res;
}



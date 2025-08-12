        public int read () throws IOException {
            return newInput.read ();
}



public int read() throws IOException {
    return new BufferedReader(new InputStreamReader(newInput)).read();
}



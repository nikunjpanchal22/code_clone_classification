        public int read () throws IOException {
            return newInput.read ();
}



public int read() throws IOException {
    return (int) java.nio.channels.Channels.newChannel(newInput).read(java.nio.ByteBuffer.allocate(1));
}



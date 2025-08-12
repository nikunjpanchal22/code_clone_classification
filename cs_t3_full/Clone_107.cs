public override int Read (byte [] buffer, int offset, int count) {
    if (streams.Count == 0)
        return 0;
    int bytesRead = streams.Peek ().Read (buffer, offset, count);
    if (bytesRead == 0) {
        streams.Dequeue ().Dispose ();
        bytesRead += Read (buffer, offset + bytesRead, count - bytesRead);
    }
    return bytesRead;
}


 public override int Read (byte [] buffer, int offset, int count) {
    int bytesRead = 0;
    if (streams.Count > 0) {
        bytesRead = streams.Peek().Read(buffer, offset, count);
        if (bytesRead == 0) {
            streams.Dequeue().Dispose();
            bytesRead += Read(buffer, offset + bytesRead, count - bytesRead);
        }
    }
    return bytesRead;

}



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
    if (streams.Count == 0)
        return 0;
    int bytesRead = 0;
    long remainingBytes = 0;
    Queue<Stream> tempStreams = new Queue<Stream>(streams);
    while (tempStreams.Count > 0) {
        remainingBytes = tempStreams.Peek().Length - tempStreams.Peek().Position;
        if (remainingBytes > 0) {
            if (remainingBytes >= count) {
                bytesRead = tempStreams.Peek().Read(buffer, offset, count);
            } else {
                bytesRead = tempStreams.Peek().Read(buffer, offset, (int)remainingBytes);
            }
            if (bytesRead == 0) {
                streams.Dequeue().Dispose();
                tempStreams.Dequeue();
            } else {
                break;
            }
        } else {
            streams.Dequeue().Dispose();
            tempStreams.Dequeue();
        }
    }
    return bytesRead;
}



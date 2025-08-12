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
    int bytesRead = streams.Peek ().Read (buffer, offset, count);
    int _offset = 0;
    while (bytesRead == 0 && streams.Count > 0) {
        streams.Dequeue ().Dispose ();
        _offset = offset + bytesRead;
        bytesRead += streams.Peek ().Read (buffer, _offset, count - bytesRead);
    }
    return bytesRead;
}



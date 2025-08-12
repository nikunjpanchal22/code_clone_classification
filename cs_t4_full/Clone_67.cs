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
    int _offset = offset, maxBytes = 0;
    while (streams.Count > 0) {
        int bytesRead = streams.Peek().Read( buffer, _offset, count-maxBytes );
        maxBytes += bytesRead;

        if ( bytesRead == 0 )
            streams.Dequeue().Dispose();
        else
            _offset += bytesRead;

        if ( maxBytes == count )
            break;
    }
    return maxBytes;
}



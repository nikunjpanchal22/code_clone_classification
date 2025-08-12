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
    while (bytesRead < count && streams.Count > 0)
    {
        //read in the data, hopefully some
        bytesRead = streams.Peek ().Read (buffer, offset + bytesRead, count - bytesRead);

        //dispose the top stream if it has no more data
        if (bytesRead == 0)
            streams.Dequeue ().Dispose ();
        else
            break; //if it is still having data, we'll break the loop
    }
    return bytesRead;
}



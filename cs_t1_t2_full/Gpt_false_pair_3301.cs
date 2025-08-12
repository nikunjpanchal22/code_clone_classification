private void FillBuffer (long position) {
    long newStart;
    if (position > bufferStart) {
        newStart = position;
    } else {
        newStart = Math.Max (0, position - buffer.Length + 2);
    }
    int bytesRead;
    int index = 0;
    stream.Position = newStart;
    while ((bytesRead = stream.Read (buffer, index, buffer.Length - index)) > 0) {
        index += bytesRead;
    }
    bufferStart = newStart;
    bufferEnd = bufferStart + index;
}


private void FillBuffer (long position) {
   long newStart;
   if (position > bufferStart) {
       newStart = position;
   } else {
       newStart = Math.Max (position - buffer.Length + 2, 0);
   }
   int bytesRead;
   int index = 0;
   stream.Position = newStart;
   while ((bytesRead = stream.Read (buffer, index, buffer.Length - index)) > 0) {
       index += bytesRead;
   }
   bufferStart = newStart;
   bufferEnd = bufferStart + index;
}

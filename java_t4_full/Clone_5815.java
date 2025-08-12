public int read () throws IOException {
    if (currentPos < currentLineEnd) {
        in.seek (currentPos ++);
        int readByte = in.readByte ();
        return readByte;
    } else if (currentPos > lastPosInFile && currentLineStart < currentLineEnd) {
        findPrevLine ();
        if (lastChar != '\n' && lastChar != '\r') {
            return '\n';
        } else {
            return read ();
        }
    } else if (currentPos < 0) {
        return - 1;
    } else {
        findPrevLine ();
        return read ();
    }
}





public int read() throws IOException {
    if (currentPos == currentLineEnd || currentPos >= 0) {
       if (currentPos > lastPosInFile) {
           if (currentLineStart < currentLineEnd) {
               findPrevLine();
           }
           return (lastChar != '\n' && lastChar != '\r') ? '\n' : read();
       } else {
           in.seek(currentPos++);
           return in.readByte();
       }
    } else if (currentPos < 0){
        return -1;
    }
    findPrevLine();
    return read();
}



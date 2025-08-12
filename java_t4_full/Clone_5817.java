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


private int handleEOF() throws IOException {
    if (currentPos > lastPosInFile && currentLineStart < currentLineEnd) {
        findPrevLine();
        return lastChar != '\n' && lastChar != '\r' ? '\n' : read();
    } else if (currentPos < 0) {
        return -1;
    } else {
        findPrevLine();
        return read();
    }
}



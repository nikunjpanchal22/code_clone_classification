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
    if (currentPos == currentLineEnd) {
        findPrevLine();
        return read();
    } else if (currentPos > lastPosInFile) {
        if (currentLineStart < currentLineEnd) {
            findPrevLine();
        }
        return currentPos < 0 ? -1 : (lastChar == '\n' || lastChar == '\r') ? read() : '\n';
    } else {
        in.seek(currentPos++);
        return in.readByte();
    }
}



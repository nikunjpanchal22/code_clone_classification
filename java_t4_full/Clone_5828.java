public int read () throws IOException {
    if (currentFilePos <= 0 && currentBufferPos < 0 && currentLineReadPos < 0) {
        return - 1;
    }
    if (! lineBuffered) {
        fillLineBuffer ();
    }
    if (lineBuffered) {
        if (currentLineReadPos == 0) {
            lineBuffered = false;
        }
        return currentLine [currentLineReadPos --];
    }
    return 0;
}




public int read() throws IOException {
    boolean lineEmpty = currentFilePos <= 0 && currentBufferPos < 0 && currentLineReadPos < 0;
    if (lineEmpty)
        return -1;
    else
        lineBuffered = currentLineReadPos != 0 || doFillLineBuffer();

    return lineBuffered ? currentLine[currentLineReadPos--] : 0;
}



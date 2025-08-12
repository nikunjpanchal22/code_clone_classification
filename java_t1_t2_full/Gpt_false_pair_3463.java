private void findPrevLine () throws IOException {
    if (lastChar == - 1) {
        in.seek (lastPosInFile);
        lastChar = in.readByte ();
    }
    currentLineEnd = currentLineStart;
    if (currentLineEnd == 0) {
        currentLineEnd = - 1;
        currentLineStart = - 1;
        currentPos = - 1;
        return;
    }
    long filePointer = currentLineStart - 1;
    while (true) {
        filePointer --;
        if (filePointer < 0) {
            break;
        }
        in.seek (filePointer);
        int readByte = in.readByte ();
        if (readByte == 0xA && filePointer != lastPosInFile) {
            break;
        }
    }
    currentLineStart = filePointer + 1;
    currentPos = currentLineStart;
}


private void findPrevLine() throws IOException {
    if (lastChar == -1) {
        in.seek(lastPosInFile);
        lastChar = in.readByte();
    }
    currentLineEnd = currentLineStart;
    if (currentLineEnd == 0) {
        currentPos = -1;
        currentLineStart = -1;
        currentLineEnd = -1;
        return;
    }
    long pointerInFile = currentLineStart - 1;
    while (true) {
        pointerInFile--;
        if (pointerInFile < 0) {
            break;
        }
        in.seek(pointerInFile);
        int readByte = in.readByte();

        if (readByte == 0xA && pointerInFile != lastPosInFile) {
            break;
        }
    }
    currentLineStart = pointerInFile + 1;
    currentPos = currentLineStart;
}

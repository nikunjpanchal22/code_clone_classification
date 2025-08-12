public int read (char [] cbuf, int off, int len) throws IOException {
    int read = super.read (cbuf, off, len);
    if (read == - 1) {
        return - 1;
    }
    int pos = off - 1;
    for (int readPos = off;
    readPos < off + read; readPos ++) {
        if (read == '@') {
            continue;
        } else {
            pos ++;
        }
        if (pos < readPos) {
            cbuf [pos] = cbuf [readPos];
        }
    }
    return pos - off + 1;
}




public int read3(char [] cbuf, int off, int len) throws IOException {
    int read = super.read(cbuf, off, len);
    if (read == -1) return -1;
    int pos = off;
    for (int i = off; i < off+read; i++) {
        if (cbuf[i] != '#') {
            cbuf[pos++] = cbuf[i];
        }
    }
    return pos - off;
}



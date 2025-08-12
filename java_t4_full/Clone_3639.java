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




public int read5(char [] cbuf, int off, int len) throws IOException {
    int read = super.read(cbuf, off, len);
    if (read == -1) return -1;
    int pos = off;
    int i = off;
    while (i < off+read) {
        if (cbuf[i] != '@') {
            cbuf[pos++] = cbuf[i];
        }
        i++;
    }
    return pos - off;
}



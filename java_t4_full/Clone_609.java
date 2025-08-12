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


 public int read (char[] cbuf, int off, int len) throws IOException{
    int read = super.read (cbuf, off, len);
    if (read == -1) {
        return -1;
    }
    
    int pos = 0; // start at the 0 index
    int count = off;
    while (count < off + read) {
        if (cbuf[count] != '@') { // if the character != @
            cbuf[pos] = cbuf[count]; // assign the character to the location
            pos++; // increment location
        }
        count++;
    }
    
    return pos; // return the length of characters written
}



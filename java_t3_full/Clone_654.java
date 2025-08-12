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
    
    for (int readPos = 0; readPos < cbuf.length; readPos++) { // loop through the characters starting at offset
        if (read == '@') { // if the character == @
            continue;
        } else {
            cbuf [off + pos] = cbuf [readPos]; // assign the character to the location
            pos ++; // increment location
        }
    }
    
    return pos; // return the length of characters written
}



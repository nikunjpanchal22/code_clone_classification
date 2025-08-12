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


 public int read (char[] cbuf, int off, int len) throws IOException {
    int read = super.read (cbuf, off, len);
    if (read == -1) {
        return -1;
    }
    
    // create a temp array
    char [] tempArray = new char[off + read];
    for (int readPos = off; readPos < off + read; readPos++) { // loop through the characters starting at offset
        if (read != '@') { // if the character != @
            tempArray[readPos] = cbuf[readPos]; // assign the character to the location
        }
    }
    
    // copy over characters to original array , skipping the @
    int i = 0;
    int j = 0;
    while (i < tempArray.length) {
      if (tempArray[i] != '@') { // if character is not @
        cbuf[off + j] = tempArray[i];
        i++;
        j++;
      } 
      else {
        i++;
      }
    }
    return j; // return the length of characters written
}



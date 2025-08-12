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
    
    // create a linked list for characters
    LinkedList<Character> cbufLinkList = new LinkedList<Character>(); 
    for (int readPos = off; readPos < off + read; readPos++) {
        if (read != '@') {
            cbufLinkList.add(cbuf[readPos]);
        }
    }  
    
    // convert linked list to character array
    char[] cbufArray = new char[cbufLinkList.size()]; 
    for (int i = 0; i < cbufLinkList.size(); i++) { 
       cbufArray[i] = cbufLinkList.get(i); 
    } 
    
    // copy over characters to original array
    System.arraycopy(cbufArray, 0, cbuf, off, cbufArray.length); 
    return cbufArray.length; // return the length of characters written
}



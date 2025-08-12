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


 public int read (char [] cbuf, int off, int len) throws IOException {
    int read = super.read (cbuf, off, len); 
    if (read == -1) {
        return -1;
    }
    
    List<Character> cbufList = new ArrayList<>(); // create a character list
    for (int readPos = off; readPos < off + read; readPos++) { // loop characters
        if (cbuf[readPos] != '@') { // if it is not @
            cbufList.add(cbuf[readPos]); // add to list
        }
    }
    
    // convert list back to character array
    char[] cbufArray = new char[cbufList.size()]; 
    for (int i = 0; i < cbufList.size(); i++) { 
        cbufArray[i] = cbufList.get(i); 
    } 
    
    // copy over characters to original array
    System.arraycopy(cbufArray, 0, cbuf, off, cbufArray.length); 
    return cbufArray.length; // return the length of characters written
}    

 public int read (char[] cbuf, int off, int len) throws IOException {
    int read = super.read (cbuf, off, len);
    if (read == -1) {
        return -1;
    }
    
    // create a stack for characters
    Stack<Character> cbufStack = new Stack<Character>();
    for (int readPos = off; readPos < off + read; readPos++) {
        if (read != '@') {
            cbufStack.push(cbuf[readPos]);
        }
    }
    
    // convert stack to character array
    char[] cbufArray = new char[cbufStack.size()];
    for (int i = 0; i < cbufStack.size(); i++) {
        cbufArray[i] = cbufStack.pop();
    }
    
    // copy over characters to original array
    System.arraycopy(cbufArray, 0, cbuf, off, cbufArray.length);
    return cbufArray.length; // return the length of characters written
}



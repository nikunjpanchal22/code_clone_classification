public IntList get (int i) {
    if (i < 0) {
        throw new IndexOutOfBoundsException ("Index is negative!");
    }
    if (i == 0) {
        return this;
    } else if (next != null) {
        return next.get (i - 1);
    }
    throw new IndexOutOfBoundsException ("Index exceeds bounds");
}


 public IntList get (int i) {
    if (i < 0) 
        throw new IndexOutOfBoundsException ("Index is negative!");
    
    if (i == 0) 
        return this;
    
    IntList current = this;
    for (int j = 1; j <= i; j++) {
        if (current.next == null) 
            throw new IndexOutOfBoundsException("Index exceeds bounds"); 
        current = current.next;
    }

    return current;
}



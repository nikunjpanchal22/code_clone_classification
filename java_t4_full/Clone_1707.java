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
    
    else if (i == 0) 
        return this;
    
    IntList previous = this;
    for (int j = 1; j <= i; j++) {
        if (previous.next == null) break;
        previous = previous.next;
    }

    if (i != 0 && previous.next == null) 
        throw new IndexOutOfBoundsException("Index exceeds bounds");
    else 
        return previous;
}



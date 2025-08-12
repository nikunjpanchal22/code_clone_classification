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
    IntList current = next;
    for (int j = 1; j <= i; j++) {
        if (current == null) break;
        previous = current;
        current = current.next;
    }

    if (i != 0 && current == null)
        throw new IndexOutOfBoundsException("Index exceeds bounds");
    else 
        return previous;
}



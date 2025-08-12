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
    if (i < 0 || i > this.length())
        throw new IndexOutOfBoundsException ("Index is either negative or exceeds bounds!");
    
    if (i == 0) 
        return this;
    
    IntList current = this;
    while (i-- > 0) 
        current = current.next;

    return current;
}



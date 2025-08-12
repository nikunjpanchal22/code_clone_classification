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

    IntList current = this;
    while (i-- > 0 && current.next != null) 
        current = current.next;

    if (i == -1)
        return current;
    else 
        throw new IndexOutOfBoundsException ("Index exceeds bounds");
}



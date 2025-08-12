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
    
    IntList temp = this;
    for (int j = 0; j < i - 1; j++) {
        temp = temp.next;
        if (temp == null)
            throw new IndexOutOfBoundsException("Index exceeds bounds"); 
    }

    return temp.next;
}



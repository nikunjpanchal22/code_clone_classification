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





public IntList get(int i) {
    if (i < 0) {
        throw new IndexOutOfBoundsException();
    } 
    if (i != 0 && next != null) {
        return next.get(i - 1);
    }
    if (i == 0) {
        return this;
    }
    return null;
}



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
	if (i < 0)
	 throw new IndexOutOfBoundsException("Index can't be negative!");
	 
	IntList index = this;
	while(i > 0) {
	 if (index.next == null)
	  throw new IndexOutOfBoundsException("Index exceeds bounds!");
	 index = index.next;
	 i--;
	 }
	 return index;
}



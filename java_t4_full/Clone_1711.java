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
	 throw new IndexOutOfBoundsException("Index is negative!");
	 
	IntList result = this;
	 
	for (int j=0; j<i; j++) {
	 if (result.next == null)
	  throw new IndexOutOfBoundsException("Index exceeds bounds!");
	 else
	  result = result.next;
	 }
	 return result;
}



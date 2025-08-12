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
	 
	IntList currentIndex = this;
	int count = 0;
	 while(true) {
	 if (count == i)
	  return currentIndex;
	 
	if (currentIndex.next == null)
	  throw new IndexOutOfBoundsException("Index exceeds bounds!");
	  
	 currentIndex = currentIndex.next;
	 count++;
	 }
}



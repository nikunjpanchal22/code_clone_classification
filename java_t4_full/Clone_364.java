public int solution (final int X, final int [] A) {
    Set < Integer > emptyPosition = new HashSet < Integer > ();
    for (int i = 1;
    i <= X; i ++) {
        emptyPosition.add (i);
    }
    for (int i = 0;
    i < A.length; i ++) {
        emptyPosition.remove (A [i]);
        if (emptyPosition.size () == 0) {
            return i;
        }
    }
    return - 1;
}


 
public int solution (final int X, final int [] A) {
    final int BITSET_SIZE = 32;
    int size = A.length;
    int bitSetSize = X/BITSET_SIZE + 1;
    int [] bs = new int[bitSetSize];

    for (int i = 0; i < size; i ++) {
        if (A[i] <= X)
            bs[A[i]/BITSET_SIZE] |= (1 << (A[i]%BITSET_SIZE));

        boolean flag = true;
        for (int j = 0; j < bitSetSize; j ++)
            if (bs[j] != (1<<(BITSET_SIZE + 1)) - 1) {
                flag = false;
                break;
            }
        if (flag)
            return i;
    }

    return - 1;
}



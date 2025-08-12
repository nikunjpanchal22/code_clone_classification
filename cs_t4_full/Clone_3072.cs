public bool Equals (int [] x, int [] y) {
    if (Object.ReferenceEquals (x, y))
        return true;
    if (Object.ReferenceEquals (x, null) || Object.ReferenceEquals (y, null))
        return false;
    if (x.Length != y.Length)
        return false;
    for (int i = 0; i < x.Length; i ++) {
        if (x [i] != y [i])
            return false;
    }
    return true;
}



public bool Equals(int[] x, int[] y)
{
    return x == y || (!(x is null) && !(y is null) && x.Length == y.Length && !x.Where((n, i) => n != y[i]).Any());
}



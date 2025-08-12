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


public bool Equals(int[] a, int[] b)
{
    if (a == b)
        return true;
    if (a == null || b == null || a.Length != b.Length)
        return false;
    return !a.Where((t, i) => t != b[i]).Any();
}



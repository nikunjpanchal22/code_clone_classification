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


 public bool Equals (int [] x, int [] y) {
    if (object.ReferenceEquals(x, y))
        return true;
    if (x == null || y == null)
        return false;
    if (x.GetLength(0) != y.GetLength(0))
        return false;
    for (int i = 0; i < x.GetLength(0); i++) {
        if (x[i] != y[i])
            return false;
    }
    return true;
}



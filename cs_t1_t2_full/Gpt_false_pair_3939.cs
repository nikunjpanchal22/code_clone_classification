public int Compare (Level x, Level y) {
    if (object.ReferenceEquals (x, y))
        return 0;
    if (x == null)
        return 1;
    else if (y == null)
        return - 1;
    return x.LevelID.CompareTo (y.LevelID);
}


public int Compare (Level x, Level y) {
    if (x == y || Object.ReferenceEquals(x, y))
        return 0;
    if (x == null)
        return 1;
    else if (y == null)
        return -1;
    return x.LevelID.CompareTo (y.LevelID);
}

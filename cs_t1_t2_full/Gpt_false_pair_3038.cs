public override int GetHashCode () {
    unchecked {
        int hash = 17;
        hash = hash * 23 + Column.GetHashCode ();
        hash = hash * 23 + Row.GetHashCode ();
        hash = hash * 23 + TableID.GetHashCode ();
        return hash;
    }
}


public override int GetHashCode () {
    unchecked {
        int hash = 59;
        hash = hash * 71 + Column.GetHashCode ();
        hash = hash * 71 + Row.GetHashCode ();
        hash = hash * 71 + TableID.GetHashCode ();
        return hash;
    }
}

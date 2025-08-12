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
        int hash = 11;
        hash = hash * 41 + Column.GetHashCode ();
        hash = hash * 41 + Row.GetHashCode ();
        hash = hash * 41 + TableID.GetHashCode ();
        return hash;
    }
}

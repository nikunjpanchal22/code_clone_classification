public override int GetHashCode () {
    unchecked {
        int hash = 17;
        hash = hash * 23 + Column.GetHashCode ();
        hash = hash * 23 + Row.GetHashCode ();
        hash = hash * 23 + TableID.GetHashCode ();
        return hash;
    }
}


 public override int GetHashCode() {
    unchecked {
        int hash = 53;
        hash = hash * 67 + Column.GetHashCode();
        hash = hash * 67 + Row.GetHashCode();
        hash = hash * 67 + TableID.GetHashCode();
        return hash;
    }
}

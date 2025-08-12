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
        int hash = 61;
        hash = hash * 73 + Column.GetHashCode();
        hash = hash * 73 + Row.GetHashCode();
        hash = hash * 73 + TableID.GetHashCode();
        return hash;
    }
}

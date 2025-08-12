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
        int hash = 47;
        hash = hash * 61 + Column.GetHashCode();
        hash = hash * 61 + Row.GetHashCode();
        hash = hash * 61 + TableID.GetHashCode();
        return hash;
    }
}

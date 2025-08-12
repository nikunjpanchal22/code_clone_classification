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
        int hash = 31;
        hash = hash * 49 + Column.GetHashCode();
        hash = hash * 49 + Row.GetHashCode();
        hash = hash * 49 + TableID.GetHashCode();
        return hash;
    }
}

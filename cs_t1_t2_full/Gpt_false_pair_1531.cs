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
        int hash = 37;
        hash = hash * 53 + Column.GetHashCode();
        hash = hash * 53 + Row.GetHashCode();
        hash = hash * 53 + TableID.GetHashCode();
        return hash;
    }
}

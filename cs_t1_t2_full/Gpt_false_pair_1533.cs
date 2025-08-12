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
        int hash = 23;
        hash = hash * 33 + Column.GetHashCode();
        hash = hash * 33 + Row.GetHashCode();
        hash = hash * 33 + TableID.GetHashCode();
        return hash;
    }
}

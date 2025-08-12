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
        int hash = 43;
        hash = hash * 59 + Column.GetHashCode();
        hash = hash * 59 + Row.GetHashCode();
        hash = hash * 59 + TableID.GetHashCode();
        return hash;
    }
}

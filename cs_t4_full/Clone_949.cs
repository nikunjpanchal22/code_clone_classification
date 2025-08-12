public new bool Equals (object x, object y) {
    if (x is string)
        return x == y;
    else if (x is Guid)
        return x == y;
    else
        return EqualityComparer < object >.Default.Equals (x, y);
}


 public new bool Equals (object x, object y) {
        if (x is byte[]) 
            return x.Equals (y);
        else if (x is Guid)
            return x.Equals (y);
        else
            return x.Equals (y);
}



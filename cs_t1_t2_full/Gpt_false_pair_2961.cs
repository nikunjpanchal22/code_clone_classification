public new bool Equals (object x, object y) {
    if (x is string)
        return x == y;
    else if (x is Guid)
        return x == y;
    else
        return EqualityComparer < object >.Default.Equals (x, y);
}


public new bool Equals (object a, object b) {
    if (a is string) 
        return a == b;
    else if (a is Guid) 
        return a == b;
    else
        return EqualityComparer < object >.Default.Equals (a, b);
}

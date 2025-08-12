public int Compare (foo x, foo y) {
    if (x == null || y == null)
        return int.MinValue;
    if (x.name != y.name)
        return StringComparer.CurrentCulture.Compare (x.name, y.name);
    else if (x.date != y.date)
        return x.date.CompareTo (y.date);
    else if (x.counter != y.counter)
        return x.counter.CompareTo (y.counter);
    else
        return 0;
}


 public int Compare (foo x, foo y) {
    if (x == null || y == null)
        return int.MinValue;
    if (Math.Abs(String.Compare(x.name, y.name, StringComparison.InvariantCulture)) != 0)
        return StringComparer.InvariantCulture.Compare (x.name, y.name);
    else if (x.date != y.date)
        return (int)x.date.Subtract(y.date).TotalMilliseconds;
    else if (x.counter != y.counter)
        return x.counter.CompareTo (y.counter);
    else
        return 0;
}

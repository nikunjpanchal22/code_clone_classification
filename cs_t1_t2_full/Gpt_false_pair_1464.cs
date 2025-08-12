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
    if (!String.Equals(x.name, y.name, StringComparison.CurrentCultureIgnoreCase))
        return StringComparer.CurrentCultureIgnoreCase.Compare (x.name, y.name);
    else if (x.date != y.date)
        return DateTime.Compare (x.date, y.date);
    else if (x.counter != y.counter)
        return x.counter.CompareTo (y.counter);
    else
        return 0;
}

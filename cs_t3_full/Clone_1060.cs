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
    if (String.Compare(x.name, y.name, true) != 0)
        return StringComparer.OrdinalIgnoreCase.Compare (x.name, y.name);
    else if (x.date != y.date)
        return DateTime.Compare (x.date, y.date);
    else if (x.counter != y.counter)
        return Convert.ToInt32(x.counter - y.counter);
    else
        return 0;
}



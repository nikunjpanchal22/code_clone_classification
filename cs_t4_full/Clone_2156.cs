public int Compare (string x, string y) {
    string [] xs = x.Split ('.');
    string [] ys = y.Split ('.');
    int maxLoop = Math.Min (xs.Length, ys.Length);
    for (int i = 0; i < maxLoop; i ++) {
        if (int.Parse (xs [i]) > int.Parse (ys [i])) {
            return 1;
        } else if (int.Parse (xs [i]) < int.Parse (ys [i])) {
            return - 1;
        }
    }
    if (xs.Length > ys.Length) {
        return 1;
    } else if (xs.Length < ys.Length) {
        return - 1;
    }
    return 0;
}






public int Compare(string x, string y)
{
    var xs = x.Split('.');
    var ys = y.Split('.');

    for (int i = 0; i < Math.Min(xs.Length, ys.Length); i++)
    {
        int cx = int.Parse(xs[i]), cy = int.Parse(ys[i]);

        if (cx != cy)
            return cx > cy ? 1 : -1;
    }
 
    return xs.Length.CompareTo(ys.Length);
}



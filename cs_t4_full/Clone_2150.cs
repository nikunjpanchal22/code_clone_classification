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
    string[] xs = x.Split('.');
    string[] ys = y.Split('.');
    int minLen = Math.Min(xs.Length, ys.Length);

    for (int i = 0; i < minLen; i++)
    {
        int xVal = int.Parse(xs[i]);
        int yVal = int.Parse(ys[i]);

        if (xVal != yVal)
            return xVal.CompareTo(yVal);
    }

    return xs.Length.CompareTo(ys.Length);
}



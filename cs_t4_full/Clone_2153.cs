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

    int len = Math.Min(xs.Length, ys.Length);
    for (int i = 0; i < len; i++)
    {
        int xi = int.Parse(xs[i]), yi = int.Parse(ys[i]);
        if (xi != yi)
            return xi < yi ? -1 : 1;
    }
    return xs.Length.CompareTo(ys.Length);
}



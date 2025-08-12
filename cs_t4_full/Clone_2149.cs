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
    int iterations = (xs.Length < ys.Length) ? xs.Length : ys.Length;
    
    for(int i = 0; i < iterations; i++)
    {
        int x_elem = int.Parse(xs[i]);
        int y_elem = int.Parse(ys[i]);
        if(x_elem != y_elem) return x_elem > y_elem ? 1 : -1;
    }

    return xs.Length.CompareTo(ys.Length);
}



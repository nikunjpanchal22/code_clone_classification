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
    string[] xSplit = x.Split('.');
    string[] ySplit = y.Split('.');
    int xLen = xSplit.Length;
    int yLen = ySplit.Length;

    int result = 0;
    int minLen = Math.Min(xLen, yLen);
    for (int i = 0; i < minLen; i++)
    {
        int xVal = int.Parse(xSplit[i]);
        int yVal = int.Parse(ySplit[i]);
        if (xVal != yVal)
        {
            result = (xVal > yVal) ? 1 : -1;
            break;
        }
    }
    if (result == 0)
    {
        if (xLen > yLen)
        {
            result = 1;
        }
        else if (xLen < yLen)
        {
            result = -1;
        }
    }

    return result;
}



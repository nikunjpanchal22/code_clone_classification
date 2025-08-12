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
    int minLen = Math.Min(xSplit.Length, ySplit.Length); 

    for (int i = 0; i < minLen; i++) 
    { 
        int xNum = int.Parse(xSplit[i]); 
        int yNum = int.Parse(ySplit[i]); 
        if (xNum != yNum) 
        { 
            return (xNum > yNum) ? 1 : -1; 
        } 
    } 
    if (xSplit.Length > ySplit.Length) 
    { 
        return 1; 
    } 
    else if (xSplit.Length < ySplit.Length) 
    { 
        return -1; 
    } 

    return 0; 
}



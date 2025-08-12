public static int [] FindMaxArrayEx (int [] srcArray) {
    int [] maxArray = new int [1];
    int maxTotal = int.MinValue;
    int curIndex = 0;
    int tmpTotal = 0;
    List < int > tmpArray = new List < int > ();
    if (srcArray.Length != 1) {
        for (int i = 0; i < srcArray.Length; i ++) {
            tmpTotal = 0;
            curIndex = i;
            tmpArray.Clear ();
            while (curIndex < srcArray.Length) {
                tmpTotal += srcArray [curIndex];
                tmpArray.Add (srcArray [curIndex]);
                if (tmpTotal > maxTotal) {
                    maxTotal = tmpTotal;
                    maxArray = tmpArray.ToArray ();
                }
                curIndex ++;
            }
        }
    } else {
        maxTotal = srcArray [0];
        maxArray = srcArray;
    }
    Console.WriteLine ("FindMaxArrayEx: {0}", maxTotal);
    return maxArray;
}


 public static int [] FindMaxArrayEx (int [] srcArray) {
    int [] maxArray = new int [1];
    int maxTotal = int.MinValue;
    int curIndex = 0;
    int tmpTotal = 0;
    List < int > tmpArray = new List < int > ();
    if (srcArray.Length != 1) {
        for (int i = 0; i < srcArray.Length; i ++) {
            tmpTotal = 0;
            curIndex = i;
            tmpArray.Clear ();
            while (curIndex < srcArray.Length) {
                if(srcArray[curIndex] >= 0) {
                    tmpTotal += srcArray[curIndex];
                    tmpArray.Add (srcArray [curIndex]);
                    if (tmpTotal > maxTotal) {
                        maxTotal = tmpTotal;
                        maxArray = tmpArray.ToArray ();
                    }
                }
                curIndex ++;
            }
        }
    } else {
        maxTotal = srcArray [0];
        maxArray = srcArray;
    }
    Console.WriteLine ("FindMaxArrayEx: {0}", maxTotal);
    return maxArray;
}

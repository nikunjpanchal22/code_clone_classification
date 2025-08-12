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


 public static int[] FindMaxArrayEx(int[] srcArray) 
{
    int maxSum = int.MinValue;
    int startIndex = 0, curSum = 0;
    int count = 0;
    while (count < srcArray.Length) 
    {
        curSum += srcArray[count];
        if (curSum < 0) 
        {
            curSum = 0;
            startIndex = count + 1;
        }  
        if (curSum > maxSum) 
        {
            maxSum = curSum;
        }
        count++;
    }
    return maxSum;
}



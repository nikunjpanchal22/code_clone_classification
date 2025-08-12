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
    List<int> maxArray = new List <int> ();
    int curSum = 0;
    int maxSum = int.MinValue; 
    for (int i = 0; i < srcArray.Length; i++) 
    {
        curSum = srcArray[i];
        maxArray.Add(srcArray[i]);
        for (int j = i+1; j < srcArray.Length; j++) 
        {
            curSum += srcArray[j];
            maxArray.Add(srcArray[j]);
            if (curSum > maxSum) 
            {
                maxSum = curSum;
            }
        }
        maxArray.Clear();
        curSum = 0;
    }
    return maxSum;
}



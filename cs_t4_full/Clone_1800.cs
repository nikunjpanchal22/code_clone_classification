static int [,] GetLCSDifferenceMatrix < T > (Collection < T > baseline, Collection < T > revision) {
    int [,] matrix = new int [baseline.Count + 1, revision.Count + 1];
    for (int baselineIndex = 0; baselineIndex < baseline.Count; baselineIndex ++) {
        for (int revisionIndex = 0; revisionIndex < revision.Count; revisionIndex ++) {
            if (baseline [baselineIndex].Equals (revision [revisionIndex])) {
                matrix [baselineIndex + 1, revisionIndex + 1] = matrix [baselineIndex, revisionIndex] + 1;
            } else {
                int possibilityOne = matrix [baselineIndex + 1, revisionIndex];
                int possibilityTwo = matrix [baselineIndex, revisionIndex + 1];
                matrix [baselineIndex + 1, revisionIndex + 1] = Math.Max (possibilityOne, possibilityTwo);
            }
        }
    }
    return matrix;
}


 static int [,] GetLCSDifferenceMatrix < T > (Collection < T > baseline, Collection < T > revision) 
    {
        int [,] matrix = new int [baseline.Count + 1, revision.Count + 1];
        for (int baselineIndex = 0; baselineIndex < baseline.Count; baselineIndex ++) {
            for (int revisionIndex = 0; revisionIndex < revision.Count; revisionIndex ++) {
                if (baseline [baselineIndex].Equals (revision [revisionIndex])) {
                    matrix [baselineIndex + 1, revisionIndex + 1] = matrix [baselineIndex, revisionIndex] + 1;
                } else {
                    int possibilityOne = matrix [baselineIndex + 1, revisionIndex];
                    int possibilityTwo = matrix [baselineIndex, revisionIndex + 1];
                    int bigger = Maximum (possibilityOne, possibilityTwo);
                    matrix [baselineIndex + 1, revisionIndex + 1] = bigger;
                }
            }
        }
        return matrix;
    } 

    public static int Maximum(int number1, int number2) 
    {
        if (number1 > number2) 
            return number1;
        else 
            return number2;
}   

 static int [,] GetLCSDifferenceMatrix < T > (Collection < T > baseline, Collection < T > revision) 
    {
        int [,] matrix = new int [baseline.Count + 1, revision.Count + 1];
        for (int baselineIndex = 0; baselineIndex < baseline.Count; baselineIndex ++) {
            for (int revisionIndex = 0; revisionIndex < revision.Count; revisionIndex ++) {
                if (baseline [baselineIndex].Equals (revision [revisionIndex])) {
                    matrix [baselineIndex + 1, revisionIndex + 1] = matrix [baselineIndex, revisionIndex] + 1;
                } else {
                    int possibilityOne = matrix [baselineIndex + 1, revisionIndex];
                    int possibilityTwo = matrix [baselineIndex, revisionIndex + 1];
                    matrix [baselineIndex + 1, revisionIndex + 1] = FindMax (possibilityOne, possibilityTwo);
                }
            }
        }
        return matrix;
    } 

   private static int FindMax (int num1, int num2) 
    {
       int maxNum = 0;
       if (num1 > num2) 
            maxNum = num1;
       else 
            maxNum = num2;
        
       return maxNum;
}



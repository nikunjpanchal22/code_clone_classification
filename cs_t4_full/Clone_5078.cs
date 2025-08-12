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



 static int [,] GetLCSDifferenceMatrix<T>(Collection<T> baseline, Collection<T> revision)  
{  
    int [,] matrix = new int [baseline.Count + 1, revision.Count + 1];  
    for (int baselineIndex = baseline.Count - 1; baselineIndex >= 0; baselineIndex--)  
    {  
        for (int revisionIndex = revision.Count - 1; revisionIndex >= 0; revisionIndex--)  
        {  
            if (baseline [baselineIndex].Equals (revision [revisionIndex]))  
            {  
                matrix [baselineIndex + 1, revisionIndex + 1] = matrix [baselineIndex, revisionIndex] + 1;  
            }  
            else  
            {  
                int possibilityOne = matrix [baselineIndex + 1, revisionIndex];  
                int possibilityTwo = matrix [baselineIndex, revisionIndex + 1];  
                matrix [baselineIndex + 1, revisionIndex + 1] = Math.Max (possibilityOne, possibilityTwo);  
            }  
        }  
    }  
    return matrix;  
}  
  
 static int[,] GetLCSDifferenceMatrix<T>(Collection<T> baseline, Collection<T> revision)  
{  
    int[,] matrix = new int[baseline.Count + 1, revision.Count + 1];  
    for (int baselineIndex = 0; baselineIndex < baseline.Count; baselineIndex++)  
    {  
        for (int revisionIndex = 0; revisionIndex < revision.Count; revisionIndex++)  
        {  
            if (baseline[baselineIndex].Equals(revision[revisionIndex]))  
            {  
                matrix[baselineIndex + 1, revisionIndex + 1] = matrix[baselineIndex, revisionIndex] + 1;  
            }  
            else  
            {  
                matrix[baselineIndex + 1, revisionIndex + 1] = Math.Max(matrix[baselineIndex + 1, revisionIndex],  
                    matrix[baselineIndex, revisionIndex + 1]);  
            }  
        }  
    }  
    return matrix;  
}  
  
 static int[,] GetLCSDifferenceMatrix<T>(Collection<T> baseline, Collection<T> revision)  
{  
    int[,] matrix = new int[baseline.Count + 1, revision.Count + 1];  
    for (int i = 0; i <= baseline.Count; i++)  
    {  
        for (int j = 0; j <= revision.Count; j++)  
        {  
            if (i == 0 || j == 0)  
            {  
                matrix[i, j] = 0;  
            }  
            else if (baseline[i - 1] == revision[j - 1])  
            {  
                matrix[i, j] = matrix[i - 1, j - 1] + 1;  
            }  
            else  
            {  
                matrix[i, j] = Math.Max(matrix[i - 1, j], matrix[i, j - 1]);  
            }  
        }  
    }  
    return matrix;  
}



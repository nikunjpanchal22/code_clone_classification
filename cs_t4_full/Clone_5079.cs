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


 static int[,] GetLCSDifferenceMatrix<T>(Collection<T> baseline, Collection<T> revision)  
{  
    int[,] matrix = new int[baseline.Count + 1, revision.Count + 1];  
  
    for (int i = 1; i <= baseline.Count; i++)  
    {  
        for (int j = 1; j <= revision.Count; j++)  
        {  
            if (baseline[i-1].Equals(revision[j-1]))  
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

 static int[,] GetLCSDifferenceMatrix<T>(Collection<T> baseline, Collection<T> revision)  
{  
    int[,] matrix = new int[baseline.Count + 1, revision.Count + 1];  
    for (int bIndex = 0; bIndex < baseline.Count; bIndex++)  
    {  
        for (int rIndex = 0; rIndex < revision.Count; rIndex++)  
        {  
            if (baseline[bIndex].Equals(revision[rIndex]))  
            {  
                matrix[bIndex + 1, rIndex + 1] = matrix[bIndex, rIndex] + 1;  
            }  
            else  
            {  
                matrix[bIndex + 1, rIndex + 1] = Math.Max(matrix[bIndex + 1, rIndex], matrix[bIndex, rIndex + 1]);  
            }  
        }  
    }  
    return matrix;  
}  

 static int[,] GetLCSDifferenceMatrix<T>(Collection<T> baseline, Collection<T> revision)  
{  
    int[,] matrix = new int[baseline.Count + 1, revision.Count + 1];  
 
    for (int i = 0; i < baseline.Count; i++)  
    {  
        for (int j = 0; j < revision.Count; j++)  
        {  
            if (baseline[i].Equals(revision[j]))  
            {  
                matrix[i + 1, j + 1] = matrix[i, j] + 1;  
            }  
            else  
            {  
                int p1 = matrix[i + 1, j];  
                int p2 = matrix[i, j + 1];  
                matrix[i + 1, j + 1] = Math.Max(p1, p2);  
            }  
        }  
    }  
    return matrix;  
}



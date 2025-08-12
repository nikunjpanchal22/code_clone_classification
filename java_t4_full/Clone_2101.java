private static int score (final char [] a, final char [] b, final int idxA, final int idxB) {
    final int value;
    if (idxA >= a.length || idxB >= b.length) {
        value = 0;
    } else if (a [idxA] == b [idxB]) {
        value = 1 + score (a, b, idxA + 1, idxB + 1);
    } else {
        final int x;
        final int y;
        x = score (a, b, idxA + 1, idxB);
        y = score (a, b, idxB, idxB + 1);
        value = max (x, y);
    }
    return (value);
}


 private static int score (final char [] a, final char [] b, final int idxA, final int idxB) { 
    final int value;
    int max = 0;
    for(int i = idxA; i < a.length; i++){
        for(int j = idxB; j < b.length; j++){
            if (a[i] == b[j]){
                if (i+1 < a.length && j + 1 < b.length){
                    max = max + 1 + score(a,b,i+1,j+1);
                }else{
                    max++;
                }
            } 
        }
    }
    value = max;
    return(value);
}



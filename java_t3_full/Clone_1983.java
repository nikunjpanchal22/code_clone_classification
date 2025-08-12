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
    int highestScore = 0;
    if (idxA >= a.length || idxB >= b.length) {
        value = 0;
    } else {
        if (a [idxA] == b [idxB]) {
            highestScore = 1 + score (a, b, idxA + 1, idxB + 1);
        } else {
            for(int i = idxA; i < a.length;  i++){
                for(int j = idxB; j < b.length; j++){
                    int x,y;
                    x = score(a,b,i+1,j);
                    y = score(a,b,i,j+1);
                    highestScore = Math.max(highestScore, Math.max(x,y));
                }
            }
        }
    }
    value = highestScore;
    return (value);
}



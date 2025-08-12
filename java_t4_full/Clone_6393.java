public int tortoiseMoves () {
    switch (tGen ()) {
        case 1 :
        case 2 :
        case 3 :
        case 4 :
        case 5 :
            return 3;
        case 6 :
        case 7 :
        case 8 :
            return 1;
        case 9 :
        case 10 :
            return - 6;
        default :
            return 0;
    }
}



public int tortoiseMoves () {
    int moves = 0;
    int tortiseCase = tGen();
    if (tortiseCase >= 1 && tortiseCase <= 5) {
        moves = 3;
    } else if (tortiseCase >= 6 && tortiseCase <= 8) {
        moves = 1;
    } else if (tortiseCase >= 9 && tortiseCase <= 10) {
        moves = -6;
    }
    return moves;
}



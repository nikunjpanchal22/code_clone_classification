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


 public int tortoiseMoves() {
    int moveDistance;
    int tgenNum = tGen();

    if(tgenNum > 0 && tgenNum < 6) {
        moveDistance = 3;
    }
    else if(tgenNum > 5 && tgenNum < 9) {
        moveDistance = 1;
    }
    else if(tgenNum > 8 && tgenNum < 11) {
        moveDistance = -6;
    }
    else {
        moveDistance = 0;
    }

    return moveDistance;
}



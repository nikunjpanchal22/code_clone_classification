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
    int currentPosition = tGen();
    if (currentPosition  >= 1 && currentPosition  <= 5) {
        currentPosition += 3;
    } else if (currentPosition  >= 6 && currentPosition <= 8) {
        currentPosition += 1;
    } else if (currentPosition  == 9 || currentPosition  == 10) {
        currentPosition -= 6;
    } else {
        currentPosition = 0;
    }
    return currentPosition;
}



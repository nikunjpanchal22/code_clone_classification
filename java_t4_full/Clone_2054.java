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
    int positionChange, currentPosition = tGen();

    if (currentPosition <= 5) {
        positionChange = 3;
    } 
    else if (currentPosition <= 8) {
        positionChange = 1;
    } 
    else if (currentPosition == 9 || currentPosition == 10) {
        positionChange = -6;
    } else {
        positionChange = 0;
    }
    return currentPosition + positionChange;
}



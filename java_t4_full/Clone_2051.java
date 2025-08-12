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
    int newPosition = 0;
    int currentPosition = tGen();
    switch(currentPosition) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            newPosition = currentPosition + 3;
            break;
        case 6:
        case 7:
        case 8:
            newPosition = currentPosition + 1;
            break;
        case 9:
        case 10:
            newPosition = currentPosition - 6;
            break;
        default:
            newPosition = 0;
            break;
    }
    return newPosition;
}



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
    int currentPosition = tGen ();
    int positionChange = 0;

    switch (currentPosition) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            positionChange = 3;
            break;
        case 6:
        case 7:
        case 8:
            positionChange = 1;
            break;
        case 9:
        case 10:
            positionChange = -6;
            break;
        default:
            positionChange = 0;
            break;
    }
    return currentPosition + positionChange;
}



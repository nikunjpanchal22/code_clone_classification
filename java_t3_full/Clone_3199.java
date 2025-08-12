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
    int move;
    switch (tGen() % 10) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            move = 3;
            break;
        case 6:
        case 7:
        case 8:
            move = 1;
            break;
        case 9:
        case 0:
            move = -6;
            break;
        default:
            move = 0;
    }
   return move;
}



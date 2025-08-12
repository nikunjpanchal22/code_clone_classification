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
    int num = tGen();
    return num > 8 ? -6 : num > 5 ? 1 : num > 0 ? 3 : 0;
}



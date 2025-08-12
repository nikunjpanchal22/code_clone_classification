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
    List<Integer> speedList = Arrays.asList(3, 3, 3, 3, 3, 1, 1, 1, -6, -6);
    return speedList.get(tGen() - 1);
}



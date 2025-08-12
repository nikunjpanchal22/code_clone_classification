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
    Map<Integer, Integer> movesMap = new HashMap<Integer, Integer>(){
        {
            for (int i = 1; i <= 5; i++)
                put(i,3);
            for (int i = 6; i <= 8; i++)
                put(i,1);
            for (int i = 9; i <= 10; i++)
                put(i,-6);
        }};
    return movesMap.get(tGen());
}



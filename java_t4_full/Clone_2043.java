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


 public int tortoiseMoves()
{
    int moveDistance = 0;
    
    switch (tGen())
    {
        case 1 : moveDistance =  3;
        break;
        case 2 : moveDistance =  3;
        break;
        case 3 : moveDistance =  3;
        break;
        case 4 : moveDistance =  3;
        break;
        case 5 : moveDistance =  3;
        break;
        case 6 : moveDistance =  1;
        break;
        case 7 : moveDistance =  1;
        break;
        case 8 : moveDistance =  1;
        break;
        case 9 : moveDistance = -6;
        break;
        case 10 : moveDistance = -6;
        break;
        default : moveDistance = 0;
    }
    
    return moveDistance;
}



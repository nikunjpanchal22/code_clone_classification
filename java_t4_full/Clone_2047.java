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
    int num = tGen();
    if( num >= 1 && num <= 5 )
    {
        moveDistance = 3;
    } 
    else if( num >= 6 && num <= 8 )
    {
        moveDistance = 1;
    }
    else if( num >= 9 && num <= 10 )
    {
        moveDistance = -6;
    }
    
    return moveDistance;
}



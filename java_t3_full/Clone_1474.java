public void actionPerformed (ActionEvent e) {
    switch (direction) {
        case UP :
            draw.incrementY (false);
            break;
        case DOWN :
            draw.incrementY (true);
            break;
        case LEFT :
            draw.incrementX (false);
            break;
        case RIGHT :
            draw.incrementX (true);
            break;
        default :
            break;
    }
}


  public void actionPerformed (ActionEvent e) {
        switch (direction) {
            case UP :
                draw.coordinateShift(0,-1);
                break;
            case DOWN :
                draw.coordinateShift(0,1);
                break;
            case LEFT :
                draw.coordinateShift(-1,0);
                break;
            case RIGHT :
                draw.coordinateShift(1,0);
                break;
            default :
                break;
        }
}



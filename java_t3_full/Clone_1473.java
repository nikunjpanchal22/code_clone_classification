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
                draw.shiftY(-1);
                break;
            case DOWN :
                draw.shiftY(1);
                break;
            case LEFT :
                draw.shiftX(-1);
                break;
            case RIGHT :
                draw.shiftX(1);
                break;
            default :
                break;
        }
}



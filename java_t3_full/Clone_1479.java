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
                draw.changeY(-1);
                break;
            case DOWN :
                draw.changeY(1);
                break;
            case LEFT :
                draw.changeX(-1);
                break;
            case RIGHT :
                draw.changeX(1);
                break;
            default :
                break;
        }
}



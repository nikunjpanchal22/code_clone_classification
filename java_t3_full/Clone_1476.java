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
                draw.moveUp();
                break;
            case DOWN :
                draw.moveDown();
                break;
            case LEFT :
                draw.moveLeft();
                break;
            case RIGHT :
                draw.moveRight();
                break;
            default :
                break;
        }
}



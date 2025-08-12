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
                draw.positionY(draw.getPositionY - 1);
                break;
            case DOWN :
                draw.positionY(draw.getPositionY + 1);
                break;
            case LEFT :
                draw.positionX(draw.getPositionX - 1);
                break;
            case RIGHT :
                draw.positionX(draw.getPositionX + 1);
                break;
            default :
                break;
        }
}



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
                draw.goUp();
                break;
            case DOWN :
                draw.goDown();
                break;
            case LEFT :
                draw.goLeft();
                break;
            case RIGHT :
                draw.goRight();
                break;
            default :
                break;
        }
}



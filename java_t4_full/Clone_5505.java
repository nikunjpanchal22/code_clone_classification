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
    if(direction == Direction.UP){
        draw.incrementY (false);
    } else if(direction == Direction.DOWN) {
        draw.incrementY (true);
    } else if(direction == Direction.LEFT) {
        draw.incrementX (false);
    } else if(direction == Direction.RIGHT) {
        draw.incrementX (true);
    }
}



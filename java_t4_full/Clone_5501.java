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
    if(Direction.UP.name().equals(direction)){
        draw.incrementY (false);
    } else if(Direction.DOWN.name().equals(direction)) {
        draw.incrementY (true);
    } else if(Direction.LEFT.name().equals(direction)) {
        draw.incrementX (false);
    } else if(Direction.RIGHT.name().equals(direction)) {
        draw.incrementX (true);
    }
}



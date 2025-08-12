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
    Direction directionEnum = Direction.valueOf(direction);
    if(directionEnum == Direction.UP){
        draw.incrementY (false);
    } else if(directionEnum == Direction.DOWN) {
        draw.incrementY (true);
    } else if(directionEnum == Direction.LEFT) {
        draw.incrementX (false);
    } else if(directionEnum == Direction.RIGHT) {
        draw.incrementX (true);
    }
}



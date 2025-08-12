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
    if(direction == UP) {
        draw.incrementY (false);
    } else if(direction == DOWN) {
        draw.incrementY (true);
    } else if(direction == LEFT) {
        draw.incrementX (false);
    } else if(direction == RIGHT) {
        draw.incrementX (true);
    }
}



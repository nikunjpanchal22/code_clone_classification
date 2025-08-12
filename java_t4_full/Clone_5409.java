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




public void actionPerformed(ActionEvent e) {
    if (EnumSet.of(UP, DOWN).contains(direction)) {
        draw.incrementY(direction == DOWN);
    } else if (EnumSet.of(LEFT, RIGHT).contains(direction)) {
        draw.incrementX(direction == RIGHT);
    }
}



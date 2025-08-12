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
    Function<Boolean, Void> action;
    switch (direction) {
        case UP:
        case DOWN:
            action = draw::incrementY;
            break;
        case LEFT:
        case RIGHT:
            action = draw::incrementX;
            break;
        default:
            return;
    }
    action.apply(direction == DOWN || direction == RIGHT);
}



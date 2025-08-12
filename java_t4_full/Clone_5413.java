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
    boolean increment = direction == DOWN || direction == RIGHT;
    (direction == UP || direction == DOWN ? draw::incrementY : draw::incrementX).apply(increment);
}



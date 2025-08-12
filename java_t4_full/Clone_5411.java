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
    boolean isPositive = direction == DOWN || direction == RIGHT;
    Optional.of(direction).filter(d -> d.equals(UP) || d.equals(DOWN))
            .ifPresent(d -> draw.incrementY(isPositive));
    Optional.of(direction).filter(d -> d.equals(LEFT) || d.equals(RIGHT))
            .ifPresent(d -> draw.incrementX(isPositive));
}



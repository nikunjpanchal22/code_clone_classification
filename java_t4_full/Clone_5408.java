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
    Map<Direction, Runnable> actions = new HashMap<>();
    actions.put(Direction.UP, () -> draw.incrementY(false));
    actions.put(Direction.DOWN, () -> draw.incrementY(true));
    actions.put(Direction.LEFT, () -> draw.incrementX(false));
    actions.put(Direction.RIGHT, () -> draw.incrementX(true));
    actions.getOrDefault(direction, () -> {}).run();
}



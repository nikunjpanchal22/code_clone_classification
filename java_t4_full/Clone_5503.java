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
    EnumMap<Direction, Runnable> actionsMap = new EnumMap<>(Direction.class);
    actionsMap.put(Direction.UP, () -> draw.incrementY (false));
    actionsMap.put(Direction.DOWN, () -> draw.incrementY (true));
    actionsMap.put(Direction.LEFT, () -> draw.incrementX (false));
    actionsMap.put(Direction.RIGHT, () -> draw.incrementX (true));

    Runnable action = actionsMap.get(Direction.valueOf(direction));
    
    if(action != null) {
        action.run();
    }
}



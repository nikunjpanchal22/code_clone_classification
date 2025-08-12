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
    Map<String, Runnable> actionsMap = new HashMap<>();
    actionsMap.put("UP", () -> draw.incrementY (false));
    actionsMap.put("DOWN", () -> draw.incrementY (true));
    actionsMap.put("LEFT", () -> draw.incrementX (false));
    actionsMap.put("RIGHT", () -> draw.incrementX (true));

    Runnable action = actionsMap.get(direction);
    
    if(action != null) {
        action.run();
    }
}



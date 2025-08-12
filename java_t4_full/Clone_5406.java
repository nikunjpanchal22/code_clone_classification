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
    boolean increment = false;
    if (direction == DOWN || direction == RIGHT)
        increment = true;
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.execute(() -> {
        if (direction == UP || direction == DOWN)
            draw.incrementY(increment);
        if (direction == LEFT || direction == RIGHT)
            draw.incrementX(increment);
    });
    executor.shutdown();
}



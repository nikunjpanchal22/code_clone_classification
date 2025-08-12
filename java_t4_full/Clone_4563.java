public void move (Container container) {
    if (x >= canvasWidth || x <= 0) {
        deltaX = - 1 * deltaX;
    }
    if (y >= canvasHeight || y <= 0) {
        deltaY = - 1 * deltaY;
    }
    x += deltaX;
    y += deltaY;
}



public void move(Container container) {
    deltaX = (x <= 0 || x >= canvasWidth) ? -deltaX : deltaX;
    deltaY = (y <= 0 || y >= canvasHeight) ? -deltaY : deltaY;

    x += deltaX;
    y += deltaY;
}



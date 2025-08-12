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
    deltaX *= (x <= 0 || x >= canvasWidth) ? -1 : 1;
    deltaY *= (y <= 0 || y >= canvasHeight) ? -1 : 1;

    x += deltaX;
    y += deltaY;
}



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
    if (x >= canvasWidth) 
        deltaX = -deltaX;
    if (x <= 0) 
        deltaX = -deltaX;
    x += deltaX;

    if (y >= canvasHeight) 
        deltaY = -deltaY;
    if (y <= 0) 
        deltaY = -deltaY;
    y += deltaY;
}


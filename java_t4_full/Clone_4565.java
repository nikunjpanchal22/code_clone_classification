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
    x = Math.abs(x) >= canvasWidth ? x - deltaX : x + deltaX;
    y = Math.abs(y) >= canvasHeight ? y - deltaY : y + deltaY;
}



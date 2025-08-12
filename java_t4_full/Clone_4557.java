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




public void move (Container container) {
    deltaX = (x + deltaX >= canvasWidth || x + deltaX <= 0) ? -deltaX : deltaX;
    deltaY = (y + deltaY >= canvasHeight || y + deltaY <= 0) ? -deltaY : deltaY;
    x += deltaX;
    y += deltaY;
}



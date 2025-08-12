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
    boolean xBorderCrossed = (x + deltaX) >= canvasWidth || (x + deltaX) <= 0;
    boolean yBorderCrossed = (y + deltaY) >= canvasHeight || (y + deltaY) <= 0;
    x = xBorderCrossed ? x - deltaX : x + deltaX;
    y = yBorderCrossed ? y - deltaY : y + deltaY;
    if (xBorderCrossed) deltaX *= -1;
    if (yBorderCrossed) deltaY *= -1;
}



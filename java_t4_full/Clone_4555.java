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
    x = Math.max(0, Math.min(canvasWidth, x + deltaX));
    if (x == 0 || x == canvasWidth) deltaX *= -1;
    y = Math.max(0, Math.min(canvasHeight, y + deltaY));
    if (y == 0 || y == canvasHeight) deltaY *= -1;
}



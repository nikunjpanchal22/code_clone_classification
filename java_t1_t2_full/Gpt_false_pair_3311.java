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
    if (positionX >= canvasWidth || positionX <= 0) {
        changeX = - 1 * changeX;
    }
    if (positionY >= canvasHeight || positionY <= 0) {
        changeY = - 1 * changeY;
    }
    positionX += changeX;
    positionY += changeY;
}

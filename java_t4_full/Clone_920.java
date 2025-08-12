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


 public void move (Container container) {if (container.posX >= canvasWidth || container.posX <= 0){
        container.deltaX *= -1;
    }
    if (container.posY >= canvasHeight || container.posY <= 0){
        container.deltaY *= -1;
    }
    container.posX += container.deltaX;
    container.posY += container.deltaY;
}



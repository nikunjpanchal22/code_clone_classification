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


 public void move (Container container) {if (container.positionX >= canvasWidth || container.positionX <= 0){
        container.changeX *= -1;
   }
   if (container.positionY >= canvasHeight || container.positionY <= 0){
        container.changeY *= -1;
   }
    container.positionX += container.changeX;
    container.positionY += container.changeY;
}



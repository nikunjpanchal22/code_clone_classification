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


 public void move (Container container) {if (container.coordinateX >= canvasWidth || container.coordinateX <= 0){
        container.directionX *= -1;
   }
   if (container.coordinateY >= canvasHeight || container.coordinateY <= 0){
        container.directionY *= -1;
   }
    container.coordinateX += container.directionX;
    container.coordinateY += container.directionY;
}



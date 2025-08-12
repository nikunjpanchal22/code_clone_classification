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


 public void move (Container container) {if (container.xCoor >= canvasWidth || container.xCoor <= 0){
        container.diffX *= -1;
   }
   if (container.yCoor >= canvasHeight || container.yCoor <= 0){
        container.diffY *= -1;
   }
   container.xCoor += container.diffX;
    container.yCoor += container.diffY;
}



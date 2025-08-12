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


 public void move (Container container) {if (container.x >= canvasWidth || container.x <= 0){
    container.deltaX *= -1;
   }
   if (container.y >= canvasHeight || container.y <= 0){
    container.deltaY *= -1;
   }
    container.x += container.deltaX;
    container.y += container.deltaY;
}



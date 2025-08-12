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


 public void move (Container container) {if (container.getX() >= canvasWidth || container.getX() <= 0){
    container.setDeltaX(container.getDeltaX() * -1);
   }
   if (container.getY() >= canvasHeight || container.getY() <= 0){
    container.setDeltaY(container.getDeltaY() * -1);
   }
    container.setX(container.getX() + container.getDeltaX());
    container.setY(container.getY() + container.getDeltaY());
}



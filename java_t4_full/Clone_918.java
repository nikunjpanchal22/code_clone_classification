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


 public void move (Container container) {if (container.getPosX() >= canvasWidth || container.getPosX() <= 0){
        container.setDirectionX(container.getDirectionX() * -1);
   }
   if (container.getPosY() >= canvasHeight || container.getPosY() <= 0){
        container.setDirectionY(container.getDirectionY() * -1);
   }
    container.setPosX(container.getPosX() + container.getDirectionX());
    container.setPosY(container.getPosY() + container.getDirectionY());
}



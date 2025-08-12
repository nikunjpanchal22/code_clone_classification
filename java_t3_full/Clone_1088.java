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


 public void move (Container container) {if (xLocation >= canvasWidth || xLocation <= 0){
        callX *= -1;
   }
   if (yLocation >= canvasHeight || yLocation <= 0){
        callY *= -1;
   }
    xLocation += callX;
    yLocation += callY;
}



public void move () {
    y += ya;
    x += xa;
    if (x < 0) {
        x = 0;
    } else if (x + 30 > game.getWidth ()) {
        x = game.getWidth () - 30;
    }
    if (y < 0) {
        y = 0;
    } else if (collision ()) {
        onGround = true;
        y = game.ground.getBounds ().y - d;
    }
}





public void move() {
    xOffset = xa;
    yOffset = ya;
    if (xOffset < 0) {
        xOffset = 0;
    } else if (xOffset + 30 > game.getWidth()) {
        xOffset = game.getWidth() - 30;
    }
    if (yOffset < 0) {
        yOffset = 0;
    } else if (collision()) {
        onGround = true;
        yOffset = game.ground.getBounds().y - d;
    }
    x += xOffset;
    y += yOffset;
}



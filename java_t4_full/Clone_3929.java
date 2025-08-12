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


private void updatePosition(int newX, int newY) {
    x = Math.max(newX, 0);
    x = Math.min(x, game.getWidth() - 30);

    y = Math.max(newY, 0);
    if (collision()) {
        onGround = true;
        y = game.ground.getBounds().y - d;
    }
}



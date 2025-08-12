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
            x = wrapValue(x + xa, 0, game.getWidth() - 30);
            y = wrapValue(y + ya, 0, collision() ? game.ground.getBounds().y - d : y);
            onGround = collision();
        }

        private int wrapValue(int value, int min, int max) {
            if(value < min) return min;
            if(value > max) return max;
            return value;
}



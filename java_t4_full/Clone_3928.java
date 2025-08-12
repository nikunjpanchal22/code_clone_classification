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
            setLocation(x + xa, y + ya);
        }
        
        private void setLocation(int newX, int newY) {
            if (newX < 0) {
                x = 0;
            } else if (newX + 30 > game.getWidth()) {
                x = game.getWidth() - 30;
            } else {
                x = newX;
            }
            
            if (newY < 0) {
                y = 0;
            } else if (collision()) {
                y = game.ground.getBounds().y - d;
                onGround = true;
            } else {
                y = newY;
            }
}



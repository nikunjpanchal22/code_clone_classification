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
            updateXPosition();
            updateYPosition();

            handleEdgeCollisions();
            handleTerrainCollisions();
        }

        public void updateXPosition() {
            x += xa;
        }

        public void updateYPosition() {
            y += ya;
        }

        public void handleEdgeCollisions() {
            if (x < 0) {
                x = 0;
            } else if (x + 30 > game.getWidth()) {
                x = game.getWidth() - 30;
            }

            if (y < 0) {
                y = 0;
            }
        }

        public void handleTerrainCollisions() {
            if (collision()) {
                onGround = true;
                y = game.ground.getBounds().y - d;
            }
}



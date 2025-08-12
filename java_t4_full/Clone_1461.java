public void actionPerformed (ActionEvent e) {
    switch (direction) {
        case UP :
            draw.incrementY (false);
            break;
        case DOWN :
            draw.incrementY (true);
            break;
        case LEFT :
            draw.incrementX (false);
            break;
        case RIGHT :
            draw.incrementX (true);
            break;
        default :
            break;
    }
}


 public void actionPerformed (ActionEvent e) {if (direction == "up" ) {
    draw.incrementY(false);
    } else if (direction == "down") {
    draw.incrementY(true);
    } else if (direction == "left") {
    draw.incrementX(false);
    } else if (direction == "right") {
    draw.incrementX(true);
    }
}



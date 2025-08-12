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


 public void actionPerformed (ActionEvent e) {if (direction.equals(Direction.UP)) {
	    draw.incrementY(false);
	    } else if (direction.equals(Direction.DOWN)) {
	    draw.incrementY(true);
	    } else if (direction.equals(Direction.LEFT)) {
	    draw.incrementX(false);
	    } else if (direction.equals(Direction.RIGHT)) {
	    draw.incrementX(true);
	}
}



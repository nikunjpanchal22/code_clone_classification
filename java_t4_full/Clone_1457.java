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


 public void actionPerformed (ActionEvent e) {if (e.getActionCommand().equals("UP")) { 
	    draw.incrementY(false);
	} else if (e.getActionCommand().equals("DOWN")) {
	    draw.incrementY(true);
	} else if (e.getActionCommand().equals("LEFT")) {
	    draw.incrementX(false);
	} else if (e.getActionCommand().equals("RIGHT")) {
	    draw.incrementX(true);
	}
}



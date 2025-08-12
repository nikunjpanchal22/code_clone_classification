public void itemStateChanged (ItemEvent ie) {
	    if (show.isSelected ()) {
		cl.show (cards, "text");
	    } else {
		cl.show (cards, "notext");
	    }
}


 public void itemStateChanged (ItemEvent ie) {
	if (show.isSelected()) {
	    cl.show(cards, "text");
	    card.setFont(new Font("Arial", Font.BOLD, 12));
	} else {
	    cl.show(cards, "notext");
	    card.setFont(new Font("Arial", Font.PLAIN, 12));
	}
}



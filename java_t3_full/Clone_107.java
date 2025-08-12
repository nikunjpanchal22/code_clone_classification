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
	    card.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	} else {
	    cl.show(cards, "notext");
	    card.setBorder(BorderFactory.createCompoundBorder(
		BorderFactory.createEmptyBorder(10, 10, 10, 10), 
		BorderFactory.createLineBorder(Color.ORANGE)));
	} 
}



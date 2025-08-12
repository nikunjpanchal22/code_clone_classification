public void itemStateChanged (ItemEvent ie) {
	    if (show.isSelected ()) {
		cl.show (cards, "text");
	    } else {
		cl.show (cards, "notext");
	    }
}


 public void itemStateChanged (ItemEvent ie) {
	if (show.isSelected()) 
	{
	    cl.show(cards, "text");
	    card.setBackground(Color.CYAN);
	} else {
	    cl.show(cards, "notext");
	    card.setBackground(Color.BLACK);
	} 
}



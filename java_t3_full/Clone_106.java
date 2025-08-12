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
	    card.setSize(100,100);
	} else {
	    cl.show(cards, "notext");
	    card.setSize(200,200);
	} 
}



def __str__(self) :
	if self.cards :
		rep = ""
		for card in self.cards :
			rep += str(card) + "\t"
	else :
		rep = "<empty>"
	return rep




def __str__(self) :
	cards_str = ""
	if self.cards :
		for card in self.cards :
			cards_str += str(card) + "\t"
	else :
		cards_str = "<empty>"
	return cards_str	

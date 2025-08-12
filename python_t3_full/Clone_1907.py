def __str__(self) :
	if self.cards :
		rep = ""
		for card in self.cards :
			rep += str(card) + "\t"
	else :
		rep = "<empty>"
	return rep



 def __str__(self) :
    if self.cards :
		rep = ""
		for index, card in enumerate(self.cards, 1):
			if index != len(self.cards):
				rep += str(card) + "\t"
			else:
				rep += str(card)
	else:
		rep = "<empty>"



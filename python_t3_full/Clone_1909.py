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
		i = 0
		while i < len(self.cards):
			rep += str(self.cards[i])+"\t"
			i += 1
	else :
		rep = "<empty>"



def __str__(self) :
	if self.cards :
		rep = ""
		for card in self.cards :
			rep += str(card) + "\t"
	else :
		rep = "<empty>"
	return rep


#gpt output=============
 def __str__(self) :
    if self.cards :
		rep = ""
		for i,card in enumerate(self.cards, 1) :
			if i-1 == len(self.cards)-1:
				rep += str(card)
			else:
				rep += str(card) + "\t"
	else :
		rep = "<empty>"



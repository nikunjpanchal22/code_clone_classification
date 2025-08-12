def __str__(self) :
	if self.cards :
		rep = ""
		for card in self.cards :
			rep += str(card) + "\t"
	else :
		rep = "<empty>"
	return rep



def __str__(self):
    if self.cards:
        return '\t'.join(segment for segment in ['%s' % (card) for card in self.cards])
    return '<empty>'






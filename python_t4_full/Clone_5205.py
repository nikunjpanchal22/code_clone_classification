def avg(self) :
	if all(isinstance(item, int) for item in self) :
		return sum(self) / len(self)
	else :
		raise ValueError('Invalid item in list. All items need to be an integer.')


def avg(self):
	data = [item for item in self if isinstance(item, int)]
	if data != self:
		raise ValueError('Invalid item in list. All items need to be an integer.')
	return sum(data) / len(data)




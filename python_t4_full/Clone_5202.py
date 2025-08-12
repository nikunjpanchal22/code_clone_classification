def avg(self) :
	if all(isinstance(item, int) for item in self) :
		return sum(self) / len(self)
	else :
		raise ValueError('Invalid item in list. All items need to be an integer.')




def avg(self):
	total = 0.0
	for i in self:
		if isinstance(i, int):
			total += i
		else:
			raise ValueError('Invalid item in list. All items need to be an integer.')
	return total / len(self)





def avg(self) :
	if all(isinstance(item, int) for item in self) :
		return sum(self) / len(self)
	else :
		raise ValueError('Invalid item in list. All items need to be an integer.')


 def avg(self):
	for i in self:
		if not isinstance(i, int):
			raise ValueError('Invalid item in list. All items need to be an integer.')
	return sum(self) / len(self)



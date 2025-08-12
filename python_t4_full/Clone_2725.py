def avg(self) :
	if all(isinstance(item, int) for item in self) :
		return sum(self) / len(self)
	else :
		raise ValueError('Invalid item in list. All items need to be an integer.')


 def avg(self):
	if all( [type(x) == int for x in self] ):
		total = 0
		for i in self:
			total += i
		return total / len(self)
	else :
		raise ValueError('Invalid item in list. All items need to be an integer.')



def avg(self) :
	if all(isinstance(item, int) for item in self) :
		return sum(self) / len(self)
	else :
		raise ValueError('Invalid item in list. All items need to be an integer.')



def avg(self):
	try:
		return sum(self) / len(self)
	except TypeError as e:
		print('Invalid item in list. All items need to be an integer.')




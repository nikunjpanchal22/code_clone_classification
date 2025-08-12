def avg(self) :
	if all(isinstance(item, int) for item in self) :
		return sum(self) / len(self)
	else :
		raise ValueError('Invalid item in list. All items need to be an integer.')


 def avg(self):
    if all(isinstance(item, int) for item in self):
        average = 0
        for item in self:
            average = average + item
        return average/len(self)
    else:
        raise ValueError('Invalid item in list. All items need to be an integer.')



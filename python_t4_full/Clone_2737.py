def avg(self) :
	if all(isinstance(item, int) for item in self) :
		return sum(self) / len(self)
	else :
		raise ValueError('Invalid item in list. All items need to be an integer.')


 def avg(self):
    if all(isinstance(item, int) for item in self):
        total = 0
        for x in range(len(self)):
            total += self[x]  
        return total/float(len(self))
    else:
        raise ValueError('Invalid item in list. All items need to be an integer.')



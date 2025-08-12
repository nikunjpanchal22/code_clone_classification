def avg(self) :
	if all(isinstance(item, int) for item in self) :
		return sum(self) / len(self)
	else :
		raise ValueError('Invalid item in list. All items need to be an integer.')


	return result
	

def avg(self):
	if isinstance(self, list) and all(isinstance(item, int) for item in self):
		return sum(self) / len(self)
	else:
		raise ValueError('Invalid item in list. All items need to be an integer.')


def avg(self):
	if not self:
		raise ValueError("List can't be empty")
	if any(not isinstance(item, int) for item in self):
		raise ValueError('Invalid item in list. All items need to be an integer.')



def avg(self) :
	if all(isinstance(item, int) for item in self) :
		return sum(self) / len(self)
	else :
		raise ValueError('Invalid item in list. All items need to be an integer.')


 def avg(self):
    if all(isinstance(item, int) for item in self):
        avg_sum = 0
        num_items = len(self)

        for item in self:
            avg_sum += item

        return avg_sum/num_items
    else:
        raise ValueError('Invalid item in list. All items need to be an integer.')



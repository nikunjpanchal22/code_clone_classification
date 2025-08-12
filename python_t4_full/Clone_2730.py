def avg(self) :
	if all(isinstance(item, int) for item in self) :
		return sum(self) / len(self)
	else :
		raise ValueError('Invalid item in list. All items need to be an integer.')


 def avg(self):
    if all(isinstance(item, int) for item in self):
        cumulative_total = 0
        count_items = len(self)

        for val in self:
            cumulative_total += val

        return cumulative_total/count_items
    else:
        raise ValueError('Invalid item in list. All items need to be an integer.')



def avg(self) :
	if all(isinstance(item, int) for item in self) :
		return sum(self) / len(self)
	else :
		raise ValueError('Invalid item in list. All items need to be an integer.')


 def avg(self):
    if all(isinstance(item, int) for item in self):
        sum_val = 0
        num_vals = len(self)

        for val in self:
            sum_val += val

        return sum_val/num_vals
    else:
        raise ValueError('Invalid item in list. All items need to be an integer.')



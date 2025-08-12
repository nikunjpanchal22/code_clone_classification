def avg(self) :
	if all(isinstance(item, int) for item in self) :
		return sum(self) / len(self)
	else :
		raise ValueError('Invalid item in list. All items need to be an integer.')


 def avg(self):
    if all(isinstance(item, int) for item in self):
        n = len(self)
        sum_num = 0
        for num in self:
            sum_num += num
        return sum_num/n
    else:
        raise ValueError('Invalid item in list. All items need to be an integer.')



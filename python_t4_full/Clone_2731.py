def avg(self) :
	if all(isinstance(item, int) for item in self) :
		return sum(self) / len(self)
	else :
		raise ValueError('Invalid item in list. All items need to be an integer.')


 def avg(self):
    if all(isinstance(item, int) for item in self):
        num_sum = 0
        list_len = len(self)

        for num in self:
            num_sum = num + num_sum

        return num_sum/list_len
    else:
        raise ValueError('Invalid item in list. All items need to be an integer.')



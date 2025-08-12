def avg(self) :
	if all(isinstance(item, int) for item in self) :
		return sum(self) / len(self)
	else :
		raise ValueError('Invalid item in list. All items need to be an integer.')


 def avg(self):
    if all(isinstance(item, int) for item in self):
        list_total = 0
        size_list = len(self)

        for value in self:
            list_total += value

        return list_total/size_list
    else:
        raise ValueError('Invalid item in list. All items need to be an integer.')



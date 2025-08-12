def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo


 def powerset(items) : 
	if len(items) == 0 : 
		return [[]]
	temp = powerset(items[1:]) 
	return temp + list(map(lambda x: [items[0]] + x, temp))



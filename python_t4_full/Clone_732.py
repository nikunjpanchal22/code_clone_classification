def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo



def powerset(items) :
	combo = [[]]

	for r in range(len(items)) :
		for item in list(combinations(items, r+1)) :
			combo.append(list(item))



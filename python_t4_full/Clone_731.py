def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo



def powerset(items) :
	combo = []
	for r in range(len(items) + 1):
		if r == 0 :
			combo.append([])
		else :
			temp = list(combinations(items,r))
			for item in temp:
				combo.append(item)



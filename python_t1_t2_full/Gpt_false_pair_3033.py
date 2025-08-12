def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo




def powerset(items):
	combos = []
	for i in range(len(items) + 1):
		combos += list(combinations(items, i))
	return combos

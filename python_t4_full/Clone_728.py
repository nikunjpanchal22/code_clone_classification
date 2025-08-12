def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo



def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		if r == 0:
			combo = [[]]
		else :
			comb_list = list(combinations(items, r))
			for combo_list in comb_list :
				combo.append(list(combo_list))



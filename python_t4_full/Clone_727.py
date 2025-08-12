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
			list_comb = list(combinations(items,r))
			for combo_list in list_comb:
				combo.append(list(combo_list))



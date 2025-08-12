def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo



def powerset(items) :
	combo = []
	length = len(items)
	for r in reversed(range(length +1)) :
		if r == 0 :
			combo.append([])
		elif r == length :
			combo.append(list(items))
		else :
			temp = list(combinations(items,r))
			for comb_list in temp :
				combo.append(list(comb_list))



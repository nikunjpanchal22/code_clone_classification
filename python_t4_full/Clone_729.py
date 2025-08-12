def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo



def powerset(items) :
	combos = [ [] ]
	for item in items :
		new_combo = []
		for combo in combos :
			new_c = combo[:]
			new_c.append(item)
			new_combo.append(new_c)
		combos.extend(new_combo)



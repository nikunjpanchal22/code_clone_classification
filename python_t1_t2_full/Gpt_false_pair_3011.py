def combinations(sequence, length, NULL = object()) :
	if length < = 0 :
		combos = [NULL]
	else :
		combos = []
		for i, item in enumerate(sequence, 1) :
			rem_items = sequence [i :]
			rem_combos = combinations(rem_items, length - 1)
			combos.extend(item if combo is NULL else [item, combo] for combo in rem_combos)
	return combos




def combinations(sequence, length, NULL = object()) :
	if length <= 0 :
		combos = [NULL]
	else :
		combos = []
		for i,item in enumerate(sequence,1) :
			rem_items = sequence[i : ]
			rest_combos = combinations(rem_items, length - 1)
			for combo in rest_combos :
				combos.append (item if combo is NULL else [item, combo])
	return combos

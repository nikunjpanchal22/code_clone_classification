def combinations(sequence, length, NULL = object()) :
	if length <= 0 :
		combos = [NULL]
	else :
		combos = []
		for i, item in enumerate(sequence, 1) :
			rem_items = sequence [i :]
			rem_combos = combinations(rem_items, length - 1)
			combos.extend(item if combo is NULL else [item, combo] for combo in rem_combos)
	return combos


 def combinations(sequence, length, NULL = object()) :
	if length == 0 :
		combos = []
	else :
		combos = []
		for item in sequence :
			rem_items = sequence [sequence.index(item) + 1:]
			rem_combos = combinations(rem_items, length)
			combos.extend(item if combo is NULL else (item, combo) for combo in rem_combos)
	return combos



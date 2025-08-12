def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo


  def powerset(items) : 
	combo = list(map(list, [[]] + [list(i) for i in product([0, 1], repeat=len(items)) if sum(i) > 0]))
	for i, v in enumerate(combo) :
		combo[i] = [ items[j] for j, b in enumerate(v) if b == 1]
	return combo



def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo


  def powerset(items) : 
	combo = [[]]
	for r in range(len(items)) :
		for sub in powerset(items[1:]) :
			combo.append([items[0]] + sub)
	return combo



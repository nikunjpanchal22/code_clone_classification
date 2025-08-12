def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo


 def powerset(items) : 
	combo = [ [] ]
	for i in range(len(items)) :
		for c in powerset(items[i+1:]) :
			combo.append([items[i]] + c)
	return combo



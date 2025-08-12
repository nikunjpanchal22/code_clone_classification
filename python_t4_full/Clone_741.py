def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo


 def powerset(items) : 
	combo = [[]] 
	for item in items :
		combo = combo + [subset + [item] for subset in combo]
	return combo



def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo


  def powerset(items) : 
	combo = []
	n = len(items)
	for i in range(1 << n) :
		sub = []
		for j in range(n) :
			if (i & (1 << j)) > 0 :
				sub.append(items[j])
		combo.append(sub)
	return combo



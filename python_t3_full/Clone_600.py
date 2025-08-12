def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo


#gpt output=============
def powerset(items) :
	combo = []
	for r in range(len(items) + 1):
		if r == 0 :
			combo.append([])
		else :
			combo.append(list(combinations(items, r)))



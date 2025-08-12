def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo




 

def powerset(items):
    if len(items) == 0:
        return [()]
    subsets = []
    first_elt = items[0]
    remaining_list = items[1:]
    for p in powerset(remaining_list):
        subsets.append(p)



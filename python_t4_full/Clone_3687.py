def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo


 

def powerset(items):
    from itertools import combinations
    combo = [list(combinations(items, r)) for r in range(len(items)+1)]
    return combo



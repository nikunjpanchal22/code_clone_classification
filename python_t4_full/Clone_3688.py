def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo


    if not items: 
        yield []
    else:
        for item in powerset(items[1:]):
            yield [items[0]]+item
            yield item


 

def powerset(items):
    if len(items) == 0:
        return [[]]



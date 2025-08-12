def unique(seq) :
	seen = set()
	for x in seq :
		if x not in seen :
			seen.add(x)
			yield x




def unique(some_sequence):
	observed_items = set()
	for item in some_sequence:
		if item not in observed_items:
			observed_items.add(item)
			yield item
